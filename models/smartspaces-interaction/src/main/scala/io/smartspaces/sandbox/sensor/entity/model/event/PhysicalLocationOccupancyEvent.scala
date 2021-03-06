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

package io.smartspaces.sandbox.sensor.entity.model.event

import io.smartspaces.sandbox.sensor.entity.model.PhysicalSpaceSensedEntityModel
import io.smartspaces.sandbox.sensor.entity.model.PersonSensedEntityModel

/**
 * An event that signals occupancy changes in a physical location.
 *
 * @author Keith M. Hughes
 */
object PhysicalLocationOccupancyEvent {

  /**
   * The type of the event.
   */
  val EVENT_TYPE = "location.occupancy"
}

/**
 * An event that signals occupancy changes in a physical location.
 *
 * @author Keith M. Hughes
 */
class PhysicalLocationOccupancyEvent(val physicalSpace: PhysicalSpaceSensedEntityModel,
    val entered: Set[PersonSensedEntityModel], val exited: Set[PersonSensedEntityModel], val timestamp: Long) {
}
