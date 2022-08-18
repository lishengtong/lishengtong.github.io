package com.bytedance.smallStream;

import com.bytedance.smallStream.api.dataStream.DataStreamSource;
import com.bytedance.smallStream.api.dataStream.SingleOutputStreamOperator;
import com.bytedance.smallStream.api.environment.StreamExecutionEnvironment;

/**
 * @author Iekr
 * Date:  2022/8/18/0018 9:37
 */
public class Test {
    public static void main(String[] args) {
        // 获取流处理器
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // 添加source
        DataStreamSource<Object> stream = env.addSource();
        // api算子操作
        SingleOutputStreamOperator<Object> data = stream.map().keyBy().window().reduce();
        // 添加sink
        data.addSink();


        //执行操作
        env.execute("job");


    }
}
