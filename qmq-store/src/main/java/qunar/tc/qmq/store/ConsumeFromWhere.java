/*
 * Copyright 2018 Qunar, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package qunar.tc.qmq.store;

/**
 * @author yunfeng.yang
 * @since 2017/11/22
 */
public enum ConsumeFromWhere {
    UNKNOWN(0), LATEST(1), EARLIEST(2);

    private int code;

    ConsumeFromWhere(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static ConsumeFromWhere codeOf(int code) {
        for (ConsumeFromWhere consumeFromWhere : ConsumeFromWhere.values()) {
            if (consumeFromWhere.code == code) {
                return consumeFromWhere;
            }
        }
        return ConsumeFromWhere.UNKNOWN;
    }
}
