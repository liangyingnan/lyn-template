package lyn.model.system.config;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.SerializationUtils;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Title:
 * @Description:
 * @Date:2018-04-04 下午 17:23
 * @author:liangyingnan
 */
public class RedisCache<K,V> implements Cache<K,V> {

	private long expireTime = 120;// 缓存的超时时间，单位为s

	private String name;

	private RedisTemplate<String, V> redisTemplate;// 通过构造方法注入该对象

	public RedisCache() {
		super();
	}

	public RedisCache(long expireTime, String name, RedisTemplate<String, V> redisTemplate) {
		this.expireTime = expireTime;
		this.name = name;
		this.redisTemplate = redisTemplate;
	}

	/**
	 * 通过key来获取对应的缓存对象
	 * 通过源码我们可以发现，shiro需要的key的类型为Object，V的类型为AuthorizationInfo对象
	 */
	@Override
	public V get(K key) throws CacheException {
		V obj =redisTemplate.opsForValue().get(name+new String(SerializationUtils.serialize(getCacheKey(key))));
		if(obj!=null)
		{
			System.out.println(obj.toString());
		}
		return obj;
	}

	@Override
	public V put(K k, V v) throws CacheException {
		redisTemplate.opsForValue().set(name+new String(SerializationUtils.serialize(getCacheKey(k))), v, this.expireTime, TimeUnit.SECONDS);
		return v;
	}

	@Override
	public V remove(K k) throws CacheException {
		V v = redisTemplate.opsForValue().get(name+new String(SerializationUtils.serialize(getCacheKey(k))));
		redisTemplate.opsForValue().getOperations().delete(name+new String(SerializationUtils.serialize(getCacheKey(k))));

		System.out.println("====removeremove========="+k+"===============");
		return v;
	}

	@Override
	public void clear() throws CacheException {
		System.out.println("清除缓存");
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Set<K> keys() {
		return null;
	}

	@Override
	public Collection<V> values() {
		return null;
	}

	private String getCacheKey(Object key) {
		return "shiro-cache" +  ":" + key;
	}

}
