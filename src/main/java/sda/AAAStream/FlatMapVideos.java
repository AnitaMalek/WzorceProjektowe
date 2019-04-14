package sda.AAAStream;

import java.util.Arrays;
import java.util.List;

public class FlatMapVideos {

    public static void main(String[] args) {

        Video video = new Video("GOT1", "got1.com");
        Video video1 = new Video("GOT2", "got2.com");
        Video video2 = new Video("GOT3", "got3.com");
        Video video3 = new Video("GOT4", "got4.com");
        Video video4 = new Video("GOT5", "got5.com");
        Video video5 = new Video("GOT6", "got6.com");

        Episode episode = new Episode("got1", 1,
                Arrays.asList(video, video1));
        Episode episode1 = new Episode("got2", 2,
                Arrays.asList(video2, video3));
        Episode episode2 = new Episode("got3", 1,
                Arrays.asList(video4, video5));

        Season season1 = new Season("GOTS1", 1,
                Arrays.asList(episode, episode1));

        Season season2 = new Season("GOTS2", 2,
                Arrays.asList(episode2));

        List <Season> seasons = Arrays.asList(season1, season2);
        System.out.println("FlatMap (spłaszczenie do episodów) : ");
        seasons.stream()
                .flatMap((Season season) -> season.episodes.stream())
                .forEach((Episode episodes) -> {
                    System.out.println(episodes);
                });
        System.out.println("FlatMap (spłaszczenie do videos) : ");
        seasons.stream()
                .flatMap((Season seasonItem)->{
                  return seasonItem.episodes.stream();
                }).flatMap((Episode episodeItem) -> {
                    return episodeItem.videos.stream();
        }).forEach((Video videoItem)->{
            System.out.println(videoItem);
        });

        System.out.println("Map (wypisanie nazw sezonów) : ");
        seasons.stream()
                .map((Season seasonName) -> {
                    return  seasonName.getSeasonName();
                })
                .forEach((String seasonName) -> {
                    System.out.println(seasonName);
                });

        System.out.println("Map (wypisanie numerów sezonów) : ");
        seasons.stream()
                .map((Season seasonNumber) -> {
                    return seasonNumber.getSeasonNumber();
                })
                .forEach((Integer seasonNumber) -> {
                    System.out.println(seasonNumber);
                });

        System.out.println("FlatMap i Map (wypisanie nazw episodów) : ");
        seasons.stream()
                .flatMap((Season season) -> season.episodes.stream())
                .map((Episode episodes) -> {
                    return episodes.getEpisodeName();
                })
                .forEach((String episodeName) -> {
                    System.out.println(episodeName);
                });

        System.out.println("FlatMap i Map (wypisanie numerów episodów) : ");
        seasons.stream()
                .flatMap((Season season) -> season.episodes.stream())
                .map((Episode episodes) -> {
                    return episodes.getEpisodeNumber();
                })
                .forEach((Integer episodeNumber) -> {
                    System.out.println(episodeNumber);
                });

        System.out.println("Flatmap i Map (wypisanie nazw video) : ");
        seasons.stream()
         .flatMap((Season season) -> season.episodes.stream())
                .flatMap((Episode episodess) -> episodess.videos.stream())
                        .map((Video videoNames) -> {
                            return videoNames.getTitle();
                        })
                        .forEach((String videosTitles) -> {
                            System.out.println(videosTitles);
                        });

        System.out.println("Flatmap i Map (wypisanie numerów video) : ");
        seasons.stream()
                .flatMap((Season season) -> season.episodes.stream())
                .flatMap((Episode episodess) -> episodess.videos.stream())
                .map((Video videoUrl) -> {
                    return videoUrl.getUrl();
                })
                .forEach((String videoUrls) -> {
                    System.out.println(videoUrls);
                });
    }

    static class Video{

        public String title;

        public String url;

        public Video(String title, String url) {
            this.title = title;
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "Video{" +
                    "title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    static class Episode {

        public String episodeName;

        public int episodeNumber;

        List<Video> videos;

        public Episode(String episodeName, int episodeNumber, List<Video> videos) {
            this.episodeName = episodeName;
            this.episodeNumber = episodeNumber;
            this.videos = videos;
        }

        public String getEpisodeName() {
            return episodeName;
        }

        public int getEpisodeNumber() {
            return episodeNumber;
        }

        public List<Video> getVideos() {
            return videos;
        }

        @Override
        public String toString() {
            return "Episode{" +
                    "episodeName='" + episodeName + '\'' +
                    ", episodeNumber=" + episodeNumber +
                    ", videos=" + videos +
                    '}';
        }
    }

    static class Season {

        public String seasonName;

        public int seasonNumber;

        List<Episode> episodes;

        public Season(String seasonName, int seasonNumber, List<Episode> episodes) {
            this.seasonName = seasonName;
            this.seasonNumber = seasonNumber;
            this.episodes = episodes;
        }

        public String getSeasonName() {
            return seasonName;
        }

        public int getSeasonNumber() {
            return seasonNumber;
        }

        public List<Episode> getEpisodes() {
            return episodes;
        }

        @Override
        public String toString() {
            return "Season{" +
                    "seasonName='" + seasonName + '\'' +
                    ", seasonNumber=" + seasonNumber +
                    ", episodes=" + episodes +
                    '}';
        }
    }
}
