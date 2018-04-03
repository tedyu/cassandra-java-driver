/*
 * Copyright DataStax, Inc.
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
package com.datastax.oss.driver.internal.querybuilder.schema.compaction;

import com.datastax.oss.driver.api.querybuilder.schema.compaction.LeveledCompactionStrategy;
import com.datastax.oss.driver.internal.querybuilder.ImmutableCollections;
import com.google.common.collect.ImmutableMap;

public class DefaultLeveledCompactionStrategy
    extends DefaultCompactionStrategy<DefaultLeveledCompactionStrategy>
    implements LeveledCompactionStrategy<DefaultLeveledCompactionStrategy> {

  public DefaultLeveledCompactionStrategy() {
    super("LeveledCompactionStrategy");
  }

  protected DefaultLeveledCompactionStrategy(ImmutableMap<String, Object> options) {
    super(options);
  }

  @Override
  public DefaultLeveledCompactionStrategy withOption(String name, Object value) {
    return new DefaultLeveledCompactionStrategy(
        ImmutableCollections.append(getInternalOptions(), name, value));
  }
}