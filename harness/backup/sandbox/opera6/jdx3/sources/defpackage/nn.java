package defpackage;

import J.N;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.leanplum.utils.SizeUtil;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.function.Predicate;
import org.web3j.abi.TypeDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.Utils;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;

/* loaded from: classes.dex */
public final /* synthetic */ class nn implements Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ nn(byte b) {
        this.a = b;
    }

    public /* synthetic */ nn(vq8 vq8Var) {
        this.a = (byte) 21;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            case 1:
                return ((Double) N.MO9jFwQ0((String) obj)) != null;
            case 2:
                return ((u92) obj) != null;
            case 3:
                return ((TypeReference) obj).isIndexed();
            case 4:
                return Event.a((TypeReference) obj);
            case 5:
                lag lagVar = ((loj) obj).b;
                if (lagVar != null) {
                    return lagVar.equals(lag.g);
                }
                return true;
            case 6:
                return ((gyj) obj).b.i("speed_dial.plus_button");
            case 7:
                return ((KeyEvent) obj).getKeyCode() == 67;
            case 8:
                return ((eri) obj) instanceof l42;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((l6e) obj).b == 9223372036854775805L;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                a1b a1bVarU = ((uah) obj).e.u(0);
                while (a1bVarU.hasNext()) {
                    if (zsk.f.containsKey((String) a1bVarU.next())) {
                        return true;
                    }
                }
                return false;
            case 11:
                return !((io7) obj).b;
            case 12:
                return ((hq8) obj).i(p6l.a).startsWith("ofa://ui/aria");
            case 13:
                return TypeDecoder.a((Class) obj);
            case 14:
                return ((yl2) obj).h().startsWith("ofa://ui/aria");
            case 15:
                return Utils.e((Field) obj);
            case 16:
                return Type.class.isAssignableFrom((Class) obj);
            case 17:
                return Utils.c((Constructor) obj);
            case SizeUtil.textSize0_1 /* 18 */:
                return Utils.f((Field) obj);
            case 19:
                return Utils.b((Field) obj);
            case SizeUtil.textSize0 /* 20 */:
                return Objects.isNull((aln) obj);
            case 21:
                return ((String) obj).startsWith("NETWORK_");
            default:
                return !TextUtils.isEmpty((String) obj);
        }
    }
}
