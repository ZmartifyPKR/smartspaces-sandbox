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

package io.smartspaces.sandbox.sensor.processing

import io.smartspaces.sandbox.sensor.entity.SensedEntityDescription
import io.smartspaces.sandbox.sensor.entity.SensorEntityDescription

/**
 * A sensor handler for sensors sensing for entities.
 *
 * @author Keith M. Hughes
 */
trait SensedEntitySensorHandler extends SensorHandler {

  /**
   * Add a sensor listener to the handler.
   *
   * @param listener
   *          the listener to add
   *
   * @return this handler
   */
  def addSensedEntitySensorListener(listener: SensedEntitySensorListener): SensedEntitySensorHandler

  /**
   * Add sensor descriptions to the handler.
   *
   * @param sensor
   *          the sensor description
   * @param sensedEntity
   *          the entity being sensed
   *
   * @return this handler
   */
  def associateSensorWithEntity(sensor: SensorEntityDescription,
    sensedEntity: SensedEntityDescription): SensedEntitySensorHandler
}
