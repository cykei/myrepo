package com.j2.w14.state.new_case;


public class VideoPlayerTestMachine {
  public static void main(String[] args) {
    VideoPlayer videoPlayer=new VideoPlayer();
    
    System.out.println(videoPlayer);
    
    videoPlayer.play();
    videoPlayer.pause();
   
  }
}