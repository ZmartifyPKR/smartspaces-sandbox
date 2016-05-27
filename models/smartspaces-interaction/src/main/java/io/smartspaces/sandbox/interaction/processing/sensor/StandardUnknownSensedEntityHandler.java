/*
 * Copyright (C) 2016 Keith M. Hughes
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.smartspaces.sandbox.interaction.processing.sensor;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.Sets;

/**
 * The standard implementation of the unknown sensor handler.
 * 
 * @author Keith M. Hughes
 */
public class StandardUnknownSensedEntityHandler implements UnknownSensedEntityHandler {

  /**
   * The set of unknown sensor IDs.
   */
  private Set<String> unknownSensorIds = new HashSet<>();
  
  @Override
  public synchronized void handleUnknownSensor(String sensorId) {
    boolean previous = unknownSensorIds.add(sensorId);
  }

  @Override
  public synchronized void removeUnknownSensorId(String sensorId) {
    unknownSensorIds.remove(sensorId);
  }

  @Override
  public synchronized Collection<String> getAllUnknownSensorIds() {
    return Sets.newHashSet(unknownSensorIds);
  }

}
