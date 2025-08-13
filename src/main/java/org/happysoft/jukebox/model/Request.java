
package org.happysoft.jukebox.model;

import java.io.Serializable;

/**
 *
 * @author chrisf
 */
public class Request implements Serializable {
  
  private RemoteDirectory remoteDirectory;
  private Track track;
  private long ownerId;
  private long requestId;
  
  public Request() {    
  }

  public Request(RemoteDirectory remoteDirectory, Track track, long ownerId, long requestId) {
    this.remoteDirectory = remoteDirectory;
    this.track = track;
    this.ownerId = ownerId;
    this.requestId = requestId;
  }  

  public RemoteDirectory getRemoteDirectory() {
    return remoteDirectory;
  }

  public Track getTrack() {
    return track;
  }

  public long getOwnerId() {
    return ownerId;
  }

  public long getRequestId() {
    return requestId;
  }
 
  public void setRemoteDirectory(RemoteDirectory dir) {
    System.out.println("Set remote directory " + dir.getDirectory());
    this.remoteDirectory = dir;
  }
  
  public void setTrack(Track track) {
    System.out.println("Set track " + track.toString());
    this.track = track;
  }

  public void setOwnerId(long ownerId) {
    this.ownerId = ownerId;
  }

  public void setRequestId(long requestId) {
    this.requestId = requestId;
  }
  
}
