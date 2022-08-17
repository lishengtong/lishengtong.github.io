package com.bytedance.smallStream.api.dataStream;

/**
 * @author Iekr
 * Date:  2022/8/17/0017 4:40
 */
public class DataStream<T> {


    // map 打散
    public <OUT> DataStream map() {
        return null;
    }

    // 根据key分区
    public <OUT> DataStream keyBy() {
        return null;
    }

    // 添加Sink端数据源对象
    public DataStreamSink<T> addSink() {
        return null;
    }


}
