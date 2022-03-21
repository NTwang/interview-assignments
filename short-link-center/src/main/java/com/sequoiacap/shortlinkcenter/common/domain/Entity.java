/*
 *
 *  Copyright 2020 byai.com All right reserved. This software is the
 *  confidential and proprietary information of byai.com ("Confidential
 *  Information"). You shall not disclose such Confidential Information and shall
 *  use it only in accordance with the terms of the license agreement you entered
 *  into with byai.com.
 * /
 */

package com.sequoiacap.shortlinkcenter.common.domain;

import java.io.Serializable;

/**
 * 领域实体对象
 */
public interface Entity<T> extends Serializable {

    /**
     * Returns the identifier of this entity instance.
     *
     * @return the entity identifier.
     */
    T getId();
}
