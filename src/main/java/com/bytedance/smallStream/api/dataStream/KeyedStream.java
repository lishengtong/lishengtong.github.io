package com.bytedance.smallStream.api.dataStream;

/**
 * @author Iekr
 * Date:  2022/8/18/0018 9:28
 */
public class KeyedStream<T, KEY> extends DataStream<T> {

    public <W> WindowedStream<T, KEY, W> window() {
        return null;
    }

    public SingleOutputStreamOperator<T> reduce() {
        return null;
    }

}
