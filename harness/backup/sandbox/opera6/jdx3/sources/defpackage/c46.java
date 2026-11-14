package defpackage;

import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c46 {
    public static final /* synthetic */ c46 a = new c46();

    @NotNull
    public final KSerializer serializer() {
        return new yqi("com.opera.celopay.model.money.Currency", uqh.a(i46.class), new itb[]{uqh.a(f46.class), uqh.a(g46.class), uqh.a(h46.class)}, new KSerializer[]{d46.a, new i58("com.opera.celopay.model.money.Currency.Fiat", g46.values()), new i58("com.opera.celopay.model.money.Currency.Token", h46.values())}, new Annotation[0]);
    }
}
