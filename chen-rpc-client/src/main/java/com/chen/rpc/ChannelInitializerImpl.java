package com.chen.rpc;

import com.chen.rpc.codec.RpcJSONDecoder;
import com.chen.rpc.codec.RpcJSONEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class ChannelInitializerImpl extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast(new IdleStateHandler(0,0,30, TimeUnit.SECONDS));
        channelPipeline.addLast(new RpcJSONDecoder());
        channelPipeline.addLast(new RpcJSONEncoder());
        channelPipeline.addLast(new RpcClientHandler());
    }
}
