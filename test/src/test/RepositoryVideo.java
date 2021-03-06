package test;


import java.util.ArrayList;

public class RepositoryVideo {
	private ArrayList<UserOld> userList;
	private ArrayList<Video> videoList;
	//private ArrayList<Comment> commentList;
	
	public RepositoryVideo() {
		userList = new ArrayList<UserOld>();
		videoList = new ArrayList<Video>();
		//commentList = new ArrayList<Comment>();
		
	UserOld u1 = new UserOld(1, "tom", "tom@email.com", "password", "url", "date");
	UserOld u2 = new UserOld(2, "mark", "mark@email.com", "password", "url", "date");
	UserOld u3 = new UserOld(2, "john", "john@email.com", "password", "url", "date");
	userList.add(u1);
	userList.add(u2);
	userList.add(u3);
	
	Video v1 = new Video(1, u1, "Titre1", "Description1", 50, "date", "url", "url", 50, 133, 899);
	Video v2 = new Video(2, u1, "Titre2", "Description2", 150, "date", "url", "url", 865, 34, 1085);
	Video v3 = new Video(3, u2, "Titre3", "Description3", 450, "date", "url", "url", 5, 1, 10);
	videoList.add(v1);
	videoList.add(v2);
	videoList.add(v3);
	}

	public ArrayList<Video> findTrending() {
		ArrayList<Video> trendingVideos = new ArrayList<Video>();
		for (Video video : videoList) {
			if (video.getVideoViewCount() > 10) {
				trendingVideos.add(video);
			}
		}
		return trendingVideos;
	}
	
	public ArrayList<Video> findRecommended() {
		ArrayList<Video> recommendedVideos = new ArrayList<Video>();
		for (Video video : videoList) {
			if (video.getVideoLikeCount() > 10) {
				recommendedVideos.add(video);
			}
		}
		return recommendedVideos;	
	}
	
	public Video findVideoByID(long ID) {
		Video selectedVideo = null;
		for (Video video : videoList) {
			if (video.getId() == ID) {
				selectedVideo = video;
			}
		}
		return selectedVideo;
		
	}
}
	
	
	
