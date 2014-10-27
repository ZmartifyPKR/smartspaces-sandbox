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

package interactivespaces.sandbox.service.control.opensoundcontrol.internal;

import interactivespaces.sandbox.service.control.opensoundcontrol.OpenSoundControlServerCommunicationEndpoint;
import interactivespaces.sandbox.service.control.opensoundcontrol.OpenSoundControlServerCommunicationEndpointService;
import interactivespaces.service.BaseSupportedService;
import interactivespaces.service.comm.network.server.UdpServerNetworkCommunicationEndpointService;

import org.apache.commons.logging.Log;

/**
 * An Interactive Spaces implementation of an Open Sound Control Server Endpoint service.
 *
 * @author Keith M. Hughes
 */
public class InteractiveSpacesOpenSoundControlServerCommunicationEndpointService extends BaseSupportedService implements
    OpenSoundControlServerCommunicationEndpointService {

  @Override
  public String getName() {
    return SERVICE_NAME;
  }

  @Override
  public OpenSoundControlServerCommunicationEndpoint newUdpEndpoint(int localPort, Log log) {
    UdpServerNetworkCommunicationEndpointService serverService =
        getSpaceEnvironment().getServiceRegistry()
            .getRequiredService(UdpServerNetworkCommunicationEndpointService.NAME);

    return new InteractiveSpacesOpenSoundControlServerCommunicationEndpoint(serverService.newServer(localPort, log),
        log);
  }
}
