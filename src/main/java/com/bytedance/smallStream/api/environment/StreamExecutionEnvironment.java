package com.bytedance.smallStream.api.environment;

import com.bytedance.smallStream.api.dataStream.DataStreamSource;

/**
 * @author Iekr
 * Date:  2022/8/17/0017 4:58
 */
public class StreamExecutionEnvironment {

    // 添加源数据对象 返回数据流
    public <OUT> DataStreamSource<OUT> addSource() {
        return null;
    }

    // 获取流处理器
    public static StreamExecutionEnvironment getExecutionEnvironment() {
        return null;
    }
}
