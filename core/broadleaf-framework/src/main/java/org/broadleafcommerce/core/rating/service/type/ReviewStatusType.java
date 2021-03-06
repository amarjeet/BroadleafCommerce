/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.rating.service.type;

import java.util.HashMap;
import java.util.Map;

public class ReviewStatusType {
    private static final long serialVersionUID = 1L;

    private static final Map<String, ReviewStatusType> TYPES = new HashMap<String, ReviewStatusType>();

    public static final ReviewStatusType PENDING = new ReviewStatusType("PENDING");
    public static final ReviewStatusType APPROVED = new ReviewStatusType("APPROVED");
    public static final ReviewStatusType REJECTED = new ReviewStatusType("REJECTED");

    public static ReviewStatusType getInstance(final String type) {
        return TYPES.get(type);
    }

    private String type;

    public ReviewStatusType() {
    }

    public ReviewStatusType(final String type) {
        setType(type);
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
        if (!TYPES.containsKey(type)) {
            TYPES.put(type, this);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReviewStatusType other = (ReviewStatusType) obj;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        return true;
    }
}
