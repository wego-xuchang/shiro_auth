package com.gitboy.febs.job.dao;


import com.gitboy.febs.job.domain.Job;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface JobMapper extends BaseMapper<Job> {

	List<Job> queryList();
}
