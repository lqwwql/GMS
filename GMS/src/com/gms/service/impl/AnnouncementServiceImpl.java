package com.gms.service.impl;

import java.util.List;

import com.gms.dao.IAnnouncementDao;
import com.gms.po.Announcement;
import com.gms.service.IAnnouncementService;

public class AnnouncementServiceImpl implements IAnnouncementService {
	private IAnnouncementDao announcementDao;
	
	public void setAnnouncementDao(IAnnouncementDao announcementDao) {
		this.announcementDao = announcementDao;
	}

	@Override
	public Announcement getAnnouncementById(Long id) {
		// TODO Auto-generated method stub
		return announcementDao.get(id);
	}

	@Override
	public Long addAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		return announcementDao.save(announcement);
	}

	@Override
	public void deleteAnnouncement(Long announcementId) {
		// TODO Auto-generated method stub
		announcementDao.delete(announcementDao.get(announcementId));
	}

	@Override
	public void updateAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		announcementDao.update(announcement);
	}

	@Override
	public List getAllAnnouncements() {
		// TODO Auto-generated method stub
		return announcementDao.findAll();
	}

}
