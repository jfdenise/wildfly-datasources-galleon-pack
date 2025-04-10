/*
 * Copyright The WildFly Authors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.wildfly.datasources.galleon.pack.test.layers.metadata;

import jakarta.annotation.sql.DataSourceDefinition;

@DataSourceDefinition(
        name="foo",
        className="com.ibm.db2.jcc.DB2DataSource"
)
public class DB2Definition {

}
