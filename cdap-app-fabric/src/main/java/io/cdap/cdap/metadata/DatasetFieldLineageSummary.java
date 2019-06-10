/*
 * Copyright © 2019 Cask Data, Inc.
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

package io.cdap.cdap.metadata;

import io.cdap.cdap.common.conf.Constants;
import io.cdap.cdap.proto.id.DatasetId;

import java.util.Set;

/**
 * The summary about all the field level lineage information about all fields in a dataset.
 */
public class DatasetFieldLineageSummary {
  private final Constants.FieldLineage.Direction direction;
  private final long startTs;
  private final long endTs;
  private final DatasetId entityId;
  private final Set<String> fields;
  private final Set<FieldLineageRelations> incoming;
  private final Set<FieldLineageRelations> outgoing;

  public DatasetFieldLineageSummary(Constants.FieldLineage.Direction direction, long startTs, long endTs,
                                    DatasetId entityId, Set<String> fields, Set<FieldLineageRelations> incoming,
                                    Set<FieldLineageRelations> outgoing) {
    this.direction = direction;
    this.startTs = startTs;
    this.endTs = endTs;
    this.entityId = entityId;
    this.fields = fields;
    this.incoming = incoming;
    this.outgoing = outgoing;
  }

  public Constants.FieldLineage.Direction getDirection() {
    return direction;
  }

  public long getStartTs() {
    return startTs;
  }

  public long getEndTs() {
    return endTs;
  }

  public DatasetId getEntityId() {
    return entityId;
  }

  public Set<String> getFields() {
    return fields;
  }

  public Set<FieldLineageRelations> getIncoming() {
    return incoming;
  }

  public Set<FieldLineageRelations> getOutgoing() {
    return outgoing;
  }
}
