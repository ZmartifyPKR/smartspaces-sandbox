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

import io.smartspaces.logging.ExtendedLog;
import io.smartspaces.sandbox.interaction.entity.model.SensedEntityModelCollection;

/**
 * A context containing values useful for {@link SensorValueProcessor}
 * implementations.
 * 
 * @author Keith M. Hughes
 */
public class SensorValueProcessorContext {

  /**
   * The collection of all models for all sensed entities.
   */
  private SensedEntityModelCollection sensedEntityModelCollection;

  /**
   * The logger to use for all processing.O
   */
  private ExtendedLog log;

  /**
   * Construct a new context.
   * 
   * @param sensedEntityModelCollection
   *          the collection of all models for all sensed entities
   * @param log
   *          the logger to use
   */
  public SensorValueProcessorContext(SensedEntityModelCollection sensedEntityModelCollection,
      ExtendedLog log) {
    this.sensedEntityModelCollection = sensedEntityModelCollection;
    this.log = log;
  }

  /**
   * Get the collection of all models for all sensed entities.
   * 
   * @returnthe collection of all models for all sensed entities
   */
  public SensedEntityModelCollection getSensedEntityModelCollection() {
    return sensedEntityModelCollection;
  }

  /**
   * Get the logger.
   * 
   * @return terhe logg
   */
  public ExtendedLog getLog() {
    return log;
  }
}
