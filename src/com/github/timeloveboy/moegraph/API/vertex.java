package com.github.timeloveboy.moegraph.API;

import com.github.timeloveboy.moegraph.GraphDB.VLIst;
import com.github.timeloveboy.moegraph.GraphDB.Vertex;
import com.github.timeloveboy.moeserver.DefaultHandle;
import com.github.timeloveboy.moeserver.IHttpRequest;
import com.github.timeloveboy.moeserver.IHttpResponse;

import java.io.IOException;

/**
 * Created by timeloveboy on 17-1-20.
 */
public class vertex extends DefaultHandle {
    @Override
    public void GET(IHttpRequest req, IHttpResponse resp) throws IOException {
        Vertex v = VLIst
        resp.write("get");
    }
}