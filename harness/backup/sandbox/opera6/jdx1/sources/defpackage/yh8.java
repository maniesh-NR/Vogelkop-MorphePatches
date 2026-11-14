package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface yh8 {
    wh8 C(byte[] bArr, List list, int i, HashMap map);

    boolean E(String str, byte[] bArr);

    void closeSession(byte[] bArr);

    void g(tw2 tw2Var);

    xh8 getProvisionRequest();

    int j();

    default void l(byte[] bArr, fjg fjgVar) {
    }

    byte[] openSession();

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2);

    void provideProvisionResponse(byte[] bArr);

    Map queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    oo9 s(byte[] bArr);
}
