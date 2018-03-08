/*
 * Copyright 2018 Emmanuel Kehinde
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

package com.emmanuelkehinde.quicksms;

/**
 * POJO representing result from Account Balance request
 */
public class GetAccountBalanceResult {

    private Double balance = 0.0;

    public GetAccountBalanceResult() {
    }

    /**
     * @return Double
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * @param balance
     */
    protected void setBalance(Double balance) {
        this.balance = balance;
    }
}
