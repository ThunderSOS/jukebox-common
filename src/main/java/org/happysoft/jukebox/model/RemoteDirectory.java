/*
 Java Jukebox
 Copyright (C) 2004, Chris Francis.

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.happysoft.jukebox.model;

import java.io.File;
import java.io.Serializable;

public class RemoteDirectory implements Serializable {

  private String host;
  private String directory;

  public RemoteDirectory() {
  }

  public RemoteDirectory(String host, String directory) {
    this.host = host;
    this.directory = directory;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getDirectory() {
    return directory;
  }

  public void setDirectory(String directory) {
    this.directory = directory;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    if (host != null) {
      sb.append(host).append(File.separator);
    }
    sb.append(directory);
    return sb.toString();
  }

}
