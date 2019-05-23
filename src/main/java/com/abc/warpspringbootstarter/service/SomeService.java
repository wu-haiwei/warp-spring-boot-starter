package com.abc.warpspringbootstarter.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SomeService {

    private String operator;

    public int doCalculate(int v1, int v2) {
        if ("+" .equals(operator)) {
            return v1 + v2;
        }
        if ("-" .equals(operator)) {
            return v1 - v2;
        }
        if ("*" .equals(operator)) {
            return v1 * v2;
        }
        if ("/" .equals(operator)) {
            return v1 / v2;
        }
        return 0;
    }
}
