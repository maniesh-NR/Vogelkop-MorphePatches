package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class b1j extends SocketFactory {
    public final int a = 65536;

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws SocketException {
        Socket socket = new Socket();
        socket.setSendBufferSize(this.a);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws SocketException {
        Socket socket = new Socket(str, i);
        socket.setSendBufferSize(this.a);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws SocketException {
        Socket socket = new Socket(str, i, inetAddress, i2);
        socket.setSendBufferSize(this.a);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws SocketException {
        Socket socket = new Socket(inetAddress, i);
        socket.setSendBufferSize(this.a);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException {
        Socket socket = new Socket(inetAddress, i, inetAddress2, i2);
        socket.setSendBufferSize(this.a);
        return socket;
    }
}
