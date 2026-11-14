package defpackage;

import android.os.Build;
import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class v37 extends n1 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v37(umi umiVar, byte b) {
        super(umiVar, (byte) 27);
        this.c = b;
    }

    @Override // defpackage.n1
    public final z37 b0() throws IOException {
        switch (this.c) {
            case 0:
                Iterator it = e82.E(new String[]{"/dev/socket/qemud", "/dev/qemu_pipe"}).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = e82.E(new String[]{"/dev/socket/genyd", "/dev/socket/baseband_genyd", "/dev/com.genymotion.superuser.daemon"}).iterator();
                        while (it2.hasNext()) {
                            if (new File((String) it2.next()).exists()) {
                            }
                        }
                        return z37.a;
                    }
                    if (new File((String) it.next()).exists()) {
                    }
                }
                return z37.b;
            default:
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/" + Process.myPid() + "/maps")), Charsets.UTF_8), 8192);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                break;
                            } else {
                                ArrayList arrayListR = aik.r(false, line, ' ');
                                if (arrayListR.size() > 5 && StringsKt.E((CharSequence) arrayListR.get(5), "frida-agent", false)) {
                                    z37 z37Var = z37.b;
                                    bufferedReader.close();
                                    return z37Var;
                                }
                            }
                        } finally {
                        }
                    }
                } catch (IOException unused) {
                    break;
                }
                break;
        }
        return z37.a;
    }

    @Override // defpackage.n1
    public final void y(Function1 function1) {
        switch (this.c) {
            case 0:
                if (!Intrinsics.a(Build.BOARD, "unknown") && !Intrinsics.a(Build.BRAND, "generic") && !Intrinsics.a(Build.DEVICE, "generic") && !Intrinsics.a(Build.MODEL, "sdk") && !Intrinsics.a(Build.PRODUCT, "sdk")) {
                    String str = Build.HARDWARE;
                    if (!Intrinsics.a(str, "goldfish") && !Intrinsics.a(str, "ranchu") && !Intrinsics.a(str, "vbox86")) {
                        super.y(function1);
                        break;
                    }
                }
                function1.invoke(z37.b);
                break;
            default:
                super.y(function1);
                break;
        }
    }
}
