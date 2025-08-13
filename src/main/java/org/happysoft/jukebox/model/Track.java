
package org.happysoft.jukebox.model;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author chrisf
 */
public class Track implements Serializable {
  
  private String artistName;
  private String albumName;
  private String trackName;
  private long trackId;
  
  public Track() {    
  }

  public Track(String artistName, String albumName, String trackName, long trackId) {
    setArtistName(artistName);
    setAlbumName(albumName);
    setTrackName(trackName);
    setTrackId(trackId);
  }

  public String getTrackName() {
    return trackName;
  }

  public long getTrackId() {
    return trackId;
  }  

  public String getArtistName() {
    return artistName;
  }

  public String getAlbumName() {
    return albumName;
  }

  public final void setArtistName(String artistName) {
    this.artistName = artistName == null ? "" : artistName + File.separatorChar;
  }

  public final void setAlbumName(String albumName) {
    this.albumName = albumName == null ? "" : albumName + File.separatorChar;
  }

  public final void setTrackName(String trackName) {
    this.trackName = trackName;
  }

  public final void setTrackId(long trackId) {
    this.trackId = trackId;
  } 
  
  @Override
  public String toString() {
    return artistName + albumName + trackName;
  }
  
}
