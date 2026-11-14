package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class uip {
    public static final bxk a = new bxk((byte) 17);

    public static final String a(Context context) {
        bxk bxkVar = a;
        AtomicReference atomicReference = (AtomicReference) bxkVar.b;
        AtomicReference atomicReference2 = (AtomicReference) bxkVar.b;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        Pair pairC = c(context);
        String str2 = (String) pairC.a;
        boolean zBooleanValue = ((Boolean) pairC.b).booleanValue();
        b(str2);
        while (true) {
            if (atomicReference2.compareAndSet(null, str2)) {
                if (zBooleanValue) {
                    List list = r8p.a;
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                    editorEdit.putString("opera.ads.sdk.user_id", str2);
                    editorEdit.apply();
                }
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        return (String) atomicReference2.get();
    }

    public static final boolean b(String str) {
        if (str.length() == 64) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (('0' <= cCharAt && cCharAt < ':') || ('a' <= cCharAt && cCharAt < 'g')) {
                }
            }
            return true;
        }
        return false;
    }

    public static final Pair c(Context context) {
        List list = r8p.a;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("opera.ads.sdk.user_id", null);
        if (string != null) {
            if (!b(string)) {
                string = null;
            }
            if (string != null) {
                return new Pair(string, Boolean.FALSE);
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[32]);
        UUID uuidRandomUUID = UUID.randomUUID();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        byteBufferWrap.putLong(mostSignificantBits);
        byteBufferWrap.putLong(leastSignificantBits);
        StringBuilder sb = new StringBuilder();
        sb.append(mostSignificantBits);
        sb.append(leastSignificantBits);
        byte[] bytes = sb.toString().getBytes(Charsets.UTF_8);
        CRC32 crc32 = new CRC32();
        crc32.update(bytes);
        long value = crc32.getValue();
        cgm cgmVar = dgm.b;
        long j = (value << 32) | (((int) value) & 4294967295L);
        byteBufferWrap.putLong(((~mostSignificantBits) ^ j) ^ System.currentTimeMillis());
        byteBufferWrap.putLong(((~leastSignificantBits) ^ j) ^ SystemClock.elapsedRealtimeNanos());
        String lowerCase = pik.D(64, StringsKt.R(CollectionsKt.P(new gbm(byteBufferWrap.array()), "", (CharSequence) null, (String) null, 0, p9p.l, 30), 64, '0')).toLowerCase(Locale.US);
        if (b(lowerCase)) {
            return new Pair(lowerCase, Boolean.TRUE);
        }
        qp2.n("Check failed.");
        return null;
    }
}
