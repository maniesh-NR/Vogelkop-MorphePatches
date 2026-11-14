package com.leanplum.internal;

import com.leanplum.LeanplumException;
import com.leanplum.internal.Constants;
import com.leanplum.internal.Request;
import com.leanplum.monitoring.ExceptionHandler;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public class Log {
    private static final int LOGGER_MAX_LEN = 4000;
    private static int level = 2;

    /* renamed from: com.leanplum.internal.Log$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$leanplum$internal$Log$LogType;

        static {
            int[] iArr = new int[LogType.values().length];
            $SwitchMap$com$leanplum$internal$Log$LogType = iArr;
            try {
                iArr[LogType.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$leanplum$internal$Log$LogType[LogType.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$leanplum$internal$Log$LogType[LogType.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class Level {
        public static final int DEBUG = 3;
        public static final int ERROR = 1;
        public static final int INFO = 2;
        public static final int OFF = 0;
    }

    public enum LogType {
        DEBUG,
        INFO,
        ERROR
    }

    public static void d(String str, Object... objArr) {
        log(LogType.DEBUG, str, objArr);
    }

    public static void e(String str, Throwable th) {
        if (str != null && str.contains("%s")) {
            log(LogType.ERROR, str, getStackTraceString(th));
            return;
        }
        LogType logType = LogType.ERROR;
        StringBuilder sbH = u35.h(str, "\n");
        sbH.append(getStackTraceString(th));
        log(logType, sbH.toString(), new Object[0]);
    }

    public static void e(String str, Object... objArr) {
        log(LogType.ERROR, str, objArr);
    }

    public static void exception(Throwable th) {
        String versionName;
        String string;
        ExceptionHandler.getInstance().reportException(th);
        if (th instanceof OutOfMemoryError) {
            if (Constants.isDevelopmentModeEnabled) {
                throw ((OutOfMemoryError) th);
            }
            return;
        }
        if (th instanceof LeanplumException) {
            if (Constants.isDevelopmentModeEnabled) {
                throw ((LeanplumException) th);
            }
            return;
        }
        e("Internal error: %s", th.getMessage());
        try {
            versionName = Util.getVersionName();
        } catch (Throwable unused) {
            versionName = "(Unknown)";
        }
        try {
            String message = th.getMessage();
            if (message != null) {
                string = th.toString() + " (" + message + ')';
            } else {
                string = th.toString();
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            printWriter.println(string);
            th.printStackTrace(printWriter);
            RequestSender.getInstance().send(RequestBuilder.withLogAction().andParam(Constants.Params.TYPE, Constants.Values.SDK_LOG).andParam(Constants.Params.VERSION_NAME, versionName).andParam(Constants.Params.MESSAGE, stringWriter.toString()).andType(Request.RequestType.IMMEDIATE).create());
        } catch (Throwable th2) {
            e("Unable to send error report: %s", th2.getMessage());
        }
    }

    private static String formatTag(LogType logType) {
        return "[Leanplum][" + logType.name() + "]";
    }

    public static String getStackTraceString(Throwable th) {
        return android.util.Log.getStackTraceString(th);
    }

    private static void handleLogMessage(String str, String str2) {
        if (Constants.loggingEnabled) {
            RequestSender.getInstance().send(RequestBuilder.withLogAction().andParam(Constants.Params.TYPE, Constants.Values.SDK_LOG).andParam(Constants.Params.MESSAGE, str + str2).create());
        }
    }

    public static void i(String str, Object... objArr) {
        log(LogType.INFO, str, objArr);
    }

    private static void largeLogD(String str, String str2) {
        if (str2.length() > LOGGER_MAX_LEN) {
            str2.substring(0, LOGGER_MAX_LEN);
            largeLogD(str, str2.substring(LOGGER_MAX_LEN));
        }
    }

    public static void log(LogType logType, String str, Object... objArr) {
        try {
            String tag = formatTag(logType);
            String str2 = String.format(str, objArr);
            int i = AnonymousClass1.$SwitchMap$com$leanplum$internal$Log$LogType[logType.ordinal()];
            if (i != 1 && i != 2 && i == 3 && level >= 3) {
                largeLogD(tag, str2);
            }
            handleLogMessage(tag, str2);
        } catch (Throwable unused) {
        }
    }

    public static void setLogLevel(int i) {
        level = i;
    }
}
