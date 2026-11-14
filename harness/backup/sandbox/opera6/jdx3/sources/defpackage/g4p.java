package defpackage;

import com.leanplum.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class g4p implements KSerializer {
    public static final g4p c = new g4p();
    public final s15 a;
    public final d2j b;

    public g4p() {
        s15 s15VarA = uqh.a(f4p.class);
        this.a = s15VarA;
        this.b = xug.g("JsonContentPolymorphicSerializer<" + s15VarA.c() + '>', nng.c, new SerialDescriptor[0]);
    }

    public final Object deserialize(Decoder decoder) {
        mng mngVarF = mkh.f(decoder);
        b bVarI = mngVarF.i();
        KSerializer kSerializerSerializer = qqb.h(bVarI).containsKey("title") ? g5p.Companion.serializer() : qqb.h(bVarI).containsKey("img") ? t4p.Companion.serializer() : qqb.h(bVarI).containsKey(Constants.Params.DATA) ? n4p.Companion.serializer() : qqb.h(bVarI).containsKey("video") ? m5p.Companion.serializer() : f4p.Companion.serializer();
        rpb rpbVarD = mngVarF.d();
        rpbVarD.getClass();
        return jym.w(rpbVarD, bVarI, kSerializerSerializer, (mng) null);
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    public final void serialize(Encoder encoder, Object obj) throws o2j {
        x79 x79VarA = encoder.a();
        s15 s15Var = this.a;
        x79VarA.I(s15Var, obj);
        KSerializer kSerializerR = zwg.r(uqh.a(obj.getClass()));
        if (kSerializerR != null) {
            kSerializerR.serialize(encoder, obj);
            return;
        }
        s15 s15VarA = uqh.a(obj.getClass());
        String strC = s15VarA.c();
        if (strC == null) {
            strC = String.valueOf(s15VarA);
        }
        throw new o2j(sko.l("Class '", strC, "' is not registered for polymorphic serialization ", "in the scope of '" + s15Var.c() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }
}
