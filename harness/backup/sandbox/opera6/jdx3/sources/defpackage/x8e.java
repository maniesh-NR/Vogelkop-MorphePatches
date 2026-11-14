package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public abstract class x8e implements Comparable<x8e> {

    @NotNull
    public static final n8e Companion = new n8e();
    public static final l4c b = z4c.a(f7c.b, new uuc(14));
    public final zyk a;

    public x8e() {
        final byte b2 = 0;
        this.a = z4c.b(new Function0(this) { // from class: m8e
            public final /* synthetic */ x8e b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                x8e x8eVar = this.b;
                switch (b3) {
                }
                return new BigDecimal(x8eVar.a(), x8eVar.b().d());
            }
        });
    }

    public /* synthetic */ x8e(int i) {
        final byte b2 = 1;
        this.a = z4c.b(new Function0(this) { // from class: m8e
            public final /* synthetic */ x8e b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b3 = b2;
                x8e x8eVar = this.b;
                switch (b3) {
                }
                return new BigDecimal(x8eVar.a(), x8eVar.b().d());
            }
        });
    }

    public abstract BigInteger a();

    public abstract i46 b();

    public final BigDecimal c() {
        return (BigDecimal) this.a.getValue();
    }

    @Override // java.lang.Comparable
    public final int compareTo(x8e x8eVar) {
        x8e x8eVar2 = x8eVar;
        d(x8eVar2);
        return c().compareTo(x8eVar2.c());
    }

    public final void d(x8e x8eVar) {
        if (Intrinsics.a(b(), x8eVar.b())) {
            return;
        }
        odf.j("Different currencies: this=", this, ", that=", x8eVar);
    }

    public String toString() {
        BigDecimal bigDecimalC = c();
        i46 i46VarB = b();
        StringBuilder sb = new StringBuilder();
        sb.append(bigDecimalC);
        sb.append(i46VarB);
        return sb.toString();
    }
}
