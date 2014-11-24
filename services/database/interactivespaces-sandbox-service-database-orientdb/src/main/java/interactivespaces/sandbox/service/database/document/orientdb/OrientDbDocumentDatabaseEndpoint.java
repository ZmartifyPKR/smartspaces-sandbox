/*
 * Copyright (C) 2014 Google Inc.
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

package interactivespaces.sandbox.service.database.document.orientdb;

import interactivespaces.util.resource.ManagedResource;

import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;

/**
 * Endpoint for an OrientDB document database.
 */
public interface OrientDbDocumentDatabaseEndpoint extends ManagedResource {
  /**
   * Creates a new connection to the database managed by this endpoint.
   *
   * @return OrientDB database connection
   */
  ODatabaseDocumentTx createConnection();
}
