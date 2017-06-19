/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.atomix.protocols.gossip.protocol;

import java.util.function.Function;

/**
 * Anti-entropy protocol listener.
 */
public interface AntiEntropyProtocolListener extends GossipProtocolListener {

  /**
   * Registers an anti-entropy advertisement handler.
   *
   * @param handler the anti-entropy advertisement handler to register
   */
  void registerAdvertisementHandler(Function<AntiEntropyAdvertisement, AntiEntropyResponse> handler);

  /**
   * Unregisters the anti-entropy advertisement handler.
   */
  void unregisterAdvertisementHandler();

}
