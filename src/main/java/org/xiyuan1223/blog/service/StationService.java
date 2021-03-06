package org.xiyuan1223.blog.service;

import javax.annotation.Resource;

import org.xiyuan1223.blog.dao.*;
import org.xiyuan1223.blog.rest.*;
import org.xiyuan1223.blog.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StationService
{
	@Resource
	private StationDao stationDao;

	public PagingResult<Station> getStations(int start, int length)
	{
		return stationDao.getStations(start, length);
	}

	public Station getStation(String id)
	{
		return stationDao.getStation(id);
	}

	public void update(Station station)
	{
		stationDao.update(station);
	}

	public void delete(String id)
	{
		stationDao.delete(id);
	}

	public void insert(Station station)
	{
		stationDao.insert(station);
	}
}
