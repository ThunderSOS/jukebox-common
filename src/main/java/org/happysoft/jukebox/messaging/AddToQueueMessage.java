
package org.happysoft.jukebox.messaging;

import org.happysoft.jukebox.model.Request;
import org.happysoft.jukebox.model.Track;

/**
 *
 * @author chrisf
 */
public class AddToQueueMessage extends JukeboxMessage {
  
  private Request request;
  
  public AddToQueueMessage() {
    
  }

  public Request getRequest() {
    return request;
  }

  public void setRequest(Request request) {
    this.request = request;
  }
  
}
