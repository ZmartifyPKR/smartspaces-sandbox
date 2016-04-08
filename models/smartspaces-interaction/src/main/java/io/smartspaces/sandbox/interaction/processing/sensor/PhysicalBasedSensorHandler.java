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

import io.smartspaces.sandbox.interaction.entity.EntityDescription;

/**
 * A sensor handler for physical based sensors.
 * 
 * @author Keith M. Hughes
 */
public interface PhysicalBasedSensorHandler extends SensorHandler {

  /**
   * Add sensor descriptions to the handler.
   * 
   * @param sensor
   *          the sensor description
   * @param physicalLocation
   *          the physical location
   * 
   * @return this handler
   */
  PhysicalBasedSensorHandler addSensorDescription(EntityDescription sensor,
      EntityDescription physicalLocation);
}
