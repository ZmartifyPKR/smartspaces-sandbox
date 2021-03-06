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

package io.smartspaces.sandbox.sensor.entity.model

import scala.collection.mutable.HashSet
import scala.collection.mutable.Set

import io.smartspaces.sandbox.sensor.entity.PhysicalSpaceSensedEntityDescription
import io.smartspaces.sandbox.sensor.entity.model.event.PhysicalLocationOccupancyEvent

/**
 * A model of a physical space.
 *
 * @author Keith M. Hughes
 */
class SimplePhysicalSpaceSensedEntityModel(
  entityDescription: PhysicalSpaceSensedEntityDescription, models: CompleteSensedEntityModel) extends SimpleSensedEntityModel(entityDescription, models)
    with PhysicalSpaceSensedEntityModel {

  /**
   * The occupants in the space.
   */
  private val occupants: Set[PersonSensedEntityModel] = new HashSet

  override def occupantEntered(person: PersonSensedEntityModel, timestamp: Long): PhysicalSpaceSensedEntityModel = {

    val hasBeenAdded = occupants.add(person)

    if (hasBeenAdded) {
      person.physicalSpaceLocation = this
      person.physicalSpaceLocationTimestamp = timestamp

      val entered = scala.collection.immutable.HashSet(person)

      models.broadcastOccupanyEvent(new PhysicalLocationOccupancyEvent(this, entered, null, timestamp))
    }

    this
  }

  override def occupantExited(person: PersonSensedEntityModel, timestamp: Long): PhysicalSpaceSensedEntityModel = {
    val wasHere = occupants.remove(person)

    if (wasHere) {
      person.physicalSpaceLocation = null
      person.physicalSpaceLocationTimestamp = timestamp

      val exited = scala.collection.immutable.HashSet(person)

      models.broadcastOccupanyEvent(new PhysicalLocationOccupancyEvent(this, null, exited, timestamp))
    }

    this
  }

  override def getOccupants(): scala.collection.immutable.Set[PersonSensedEntityModel] = {
    occupants.toSet
  }
}
