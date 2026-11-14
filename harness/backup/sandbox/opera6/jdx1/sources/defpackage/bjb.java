package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class bjb extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private rvd unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public static class a extends bjb {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public bjb(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public bjb(Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public bjb(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public bjb(String str, IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }

    public bjb(String str, Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public static bjb invalidEndTag() {
        return new bjb("Protocol message end-group tag did not match expected tag.");
    }

    public static bjb invalidTag() {
        return new bjb("Protocol message contained an invalid tag (zero).");
    }

    public static bjb invalidUtf8() {
        return new bjb("Protocol message had invalid UTF-8.");
    }

    public static a invalidWireType() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static bjb malformedVarint() {
        return new bjb("CodedInputStream encountered a malformed varint.");
    }

    public static bjb negativeSize() {
        return new bjb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static bjb parseFailure() {
        return new bjb("Failed to parse the message.");
    }

    public static bjb recursionLimitExceeded() {
        return new bjb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static bjb sizeLimitExceeded() {
        return new bjb("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public static bjb truncatedMessage() {
        return new bjb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public rvd getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    public bjb setUnfinishedMessage(rvd rvdVar) {
        this.unfinishedMessage = rvdVar;
        return this;
    }

    public IOException unwrapIOException() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }
}
