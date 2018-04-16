package lyn.model.common.service;

import lyn.model.common.domain.LogDO;
import lyn.model.common.domain.PageDO;
import lyn.model.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
