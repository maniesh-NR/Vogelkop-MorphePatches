package defpackage;

import defpackage.g72;
import defpackage.j4o;
import defpackage.w5;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class gv9 extends w5 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static final Map<Class<?>, gv9> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected dmm unknownFields = dmm.getDefaultInstance();

    public static abstract class a extends w5.a {
        private final gv9 defaultInstance;
        protected gv9 instance;

        public a(gv9 gv9Var) {
            this.defaultInstance = gv9Var;
            if (gv9Var.isMutable()) {
                qp2.o("Default instance must be immutable.");
                throw null;
            }
            this.instance = newMutableInstance();
        }

        private static <MessageType extends gv9> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            x6h.getInstance().schemaFor((x6h) messagetype).mergeFrom(messagetype, messagetype2);
        }

        private gv9 newMutableInstance() {
            return this.defaultInstance.newMutableInstance();
        }

        @Override // w5.a, defpackage.qvd
        public final gv9 build() {
            gv9 gv9VarBuildPartial = buildPartial();
            if (gv9VarBuildPartial.isInitialized()) {
                return gv9VarBuildPartial;
            }
            throw w5.a.newUninitializedMessageException(gv9VarBuildPartial);
        }

        @Override // w5.a, defpackage.qvd
        public gv9 buildPartial() {
            boolean zIsMutable = this.instance.isMutable();
            gv9 gv9Var = this.instance;
            if (!zIsMutable) {
                return gv9Var;
            }
            gv9Var.makeImmutable();
            return this.instance;
        }

        @Override // w5.a, defpackage.qvd
        public final a clear() {
            if (this.defaultInstance.isMutable()) {
                qp2.o("Default instance must be immutable.");
                return null;
            }
            this.instance = newMutableInstance();
            return this;
        }

        @Override // w5.a, defpackage.qvd
        public a clone() {
            a aVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            aVarNewBuilderForType.instance = buildPartial();
            return aVarNewBuilderForType;
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            gv9 gv9VarNewMutableInstance = newMutableInstance();
            mergeFromInstance(gv9VarNewMutableInstance, this.instance);
            this.instance = gv9VarNewMutableInstance;
        }

        @Override // w5.a, defpackage.qvd, defpackage.svd
        public gv9 getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // w5.a
        public a internalMergeFrom(gv9 gv9Var) {
            return mergeFrom(gv9Var);
        }

        @Override // w5.a, defpackage.qvd, defpackage.svd
        public final boolean isInitialized() {
            return gv9.isInitialized(this.instance, false);
        }

        public a mergeFrom(gv9 gv9Var) {
            if (gv9Var != null && !getDefaultInstanceForType().getClass().isInstance(gv9Var)) {
                qp2.o("mergeFrom(MessageLite) can only merge messages of the same type.");
                return null;
            }
            if (getDefaultInstanceForType().equals(gv9Var)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, gv9Var);
            return this;
        }

        @Override // w5.a, defpackage.qvd
        public a mergeFrom(r75 r75Var, yk8 yk8Var) throws IOException {
            copyOnWrite();
            try {
                x6h.getInstance().schemaFor((x6h) this.instance).mergeFrom(this.instance, u75.forCodedInput(r75Var), yk8Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // w5.a, defpackage.qvd
        public a mergeFrom(byte[] bArr, int i, int i2) {
            return mergeFrom(bArr, i, i2, yk8.getEmptyRegistry());
        }

        @Override // w5.a, defpackage.qvd
        public a mergeFrom(byte[] bArr, int i, int i2, yk8 yk8Var) throws bjb {
            copyOnWrite();
            try {
                x6h.getInstance().schemaFor((x6h) this.instance).mergeFrom(this.instance, bArr, i, i + i2, new g72.a(yk8Var));
                return this;
            } catch (bjb e) {
                throw e;
            } catch (IOException e2) {
                h9o.s("Reading from byte array should not throw IOException.", e2);
                return null;
            } catch (IndexOutOfBoundsException unused) {
                throw bjb.truncatedMessage();
            }
        }
    }

    public static class b extends g6 {
        private final gv9 defaultInstance;

        public b(gv9 gv9Var) {
            this.defaultInstance = gv9Var;
        }

        @Override // defpackage.g6, defpackage.p1g
        public gv9 parsePartialFrom(r75 r75Var, yk8 yk8Var) {
            return gv9.parsePartialFrom(this.defaultInstance, r75Var, yk8Var);
        }

        @Override // defpackage.g6, defpackage.p1g
        public gv9 parsePartialFrom(byte[] bArr, int i, int i2, yk8 yk8Var) {
            return gv9.parsePartialFrom(this.defaultInstance, bArr, i, i2, yk8Var);
        }
    }

    public static abstract class c extends gv9 implements ev9 {
        protected f09 extensions = f09.emptySet();

        public class a {
            private final Iterator<Map.Entry<d, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<d, Object> next;

            private a(boolean z) {
                Iterator it = c.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
                this.messageSetWireFormat = z;
            }

            public /* synthetic */ a(c cVar, boolean z, zu9 zu9Var) {
                this(z);
            }

            public void writeUntil(int i, y75 y75Var) {
                while (true) {
                    Map.Entry<d, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    d key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == j4o.b.MESSAGE && !key.isRepeated()) {
                        y75Var.writeMessageSetExtension(key.getNumber(), (rvd) this.next.getValue());
                    } else {
                        f09.writeField(key, this.next.getValue(), y75Var);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(r75 r75Var, e eVar, yk8 yk8Var, int i) {
            parseExtension(r75Var, yk8Var, eVar, j4o.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(v44 v44Var, yk8 yk8Var, e eVar) {
            rvd rvdVar = (rvd) this.extensions.getField(eVar.descriptor);
            qvd builder = rvdVar != null ? rvdVar.toBuilder() : null;
            if (builder == null) {
                builder = eVar.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(v44Var, yk8Var);
            ensureExtensionsAreMutable().setField(eVar.descriptor, eVar.singularToFieldSetType(builder.build()));
        }

        private <MessageType2 extends rvd> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, r75 r75Var, yk8 yk8Var) {
            int uInt32 = 0;
            v44 bytes = null;
            e eVarFindLiteExtensionByNumber = null;
            while (true) {
                int tag = r75Var.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == j4o.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = r75Var.readUInt32();
                    if (uInt32 != 0) {
                        eVarFindLiteExtensionByNumber = yk8Var.findLiteExtensionByNumber(messagetype2, uInt32);
                    }
                } else if (tag == j4o.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || eVarFindLiteExtensionByNumber == null) {
                        bytes = r75Var.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(r75Var, eVarFindLiteExtensionByNumber, yk8Var, uInt32);
                        bytes = null;
                    }
                } else if (!r75Var.skipField(tag)) {
                    break;
                }
            }
            r75Var.checkLastTagWas(j4o.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (eVarFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, yk8Var, eVarFindLiteExtensionByNumber);
            } else {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean parseExtension(defpackage.r75 r6, defpackage.yk8 r7, gv9.e r8, int r9, int r10) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gv9.c.parseExtension(r75, yk8, gv9$e, int, int):boolean");
        }

        private void verifyExtensionContainingType(e eVar) {
            if (eVar.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                return;
            }
            qp2.o("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public f09 ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m13clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override // defpackage.gv9, defpackage.w5, defpackage.rvd, defpackage.svd
        public /* bridge */ /* synthetic */ rvd getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // defpackage.ev9
        public final <Type> Type getExtension(tk8 tk8Var) {
            e eVarCheckIsLite = gv9.checkIsLite(tk8Var);
            verifyExtensionContainingType(eVarCheckIsLite);
            Object field = this.extensions.getField(eVarCheckIsLite.descriptor);
            return field == null ? (Type) eVarCheckIsLite.defaultValue : (Type) eVarCheckIsLite.fromFieldSetType(field);
        }

        @Override // defpackage.ev9
        public final <Type> Type getExtension(tk8 tk8Var, int i) {
            e eVarCheckIsLite = gv9.checkIsLite(tk8Var);
            verifyExtensionContainingType(eVarCheckIsLite);
            return (Type) eVarCheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(eVarCheckIsLite.descriptor, i));
        }

        @Override // defpackage.ev9
        public final <Type> int getExtensionCount(tk8 tk8Var) {
            e eVarCheckIsLite = gv9.checkIsLite(tk8Var);
            verifyExtensionContainingType(eVarCheckIsLite);
            return this.extensions.getRepeatedFieldCount(eVarCheckIsLite.descriptor);
        }

        @Override // defpackage.ev9
        public final <Type> boolean hasExtension(tk8 tk8Var) {
            e eVarCheckIsLite = gv9.checkIsLite(tk8Var);
            verifyExtensionContainingType(eVarCheckIsLite);
            return this.extensions.hasField(eVarCheckIsLite.descriptor);
        }

        public final void mergeExtensionFields(c cVar) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m13clone();
            }
            this.extensions.mergeFrom(cVar.extensions);
        }

        @Override // defpackage.gv9, defpackage.w5, defpackage.rvd
        public /* bridge */ /* synthetic */ qvd newBuilderForType() {
            return newBuilderForType();
        }

        public gv9$c.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public gv9$c.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        public <MessageType2 extends rvd> boolean parseUnknownField(MessageType2 messagetype2, r75 r75Var, yk8 yk8Var, int i) {
            int tagFieldNumber = j4o.getTagFieldNumber(i);
            return parseExtension(r75Var, yk8Var, yk8Var.findLiteExtensionByNumber(messagetype2, tagFieldNumber), i, tagFieldNumber);
        }

        public <MessageType2 extends rvd> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, r75 r75Var, yk8 yk8Var, int i) {
            if (i != j4o.MESSAGE_SET_ITEM_TAG) {
                return j4o.getTagWireType(i) == 2 ? parseUnknownField(messagetype2, r75Var, yk8Var, i) : r75Var.skipField(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype2, r75Var, yk8Var);
            return true;
        }

        @Override // defpackage.gv9, defpackage.w5, defpackage.rvd
        public /* bridge */ /* synthetic */ qvd toBuilder() {
            return toBuilder();
        }
    }

    public static final class d implements e09 {
        final zeb enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final j4o.a type;

        public d(zeb zebVar, int i, j4o.a aVar, boolean z, boolean z2) {
            this.enumTypeMap = zebVar;
            this.number = i;
            this.type = aVar;
            this.isRepeated = z;
            this.isPacked = z2;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return this.number - dVar.number;
        }

        @Override // defpackage.e09
        public zeb getEnumType() {
            return this.enumTypeMap;
        }

        @Override // defpackage.e09
        public j4o.b getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // defpackage.e09
        public j4o.a getLiteType() {
            return this.type;
        }

        @Override // defpackage.e09
        public int getNumber() {
            return this.number;
        }

        @Override // defpackage.e09
        public void internalMergeFrom(Object obj, Object obj2) {
            ((a) obj).mergeFrom((gv9) obj2);
        }

        @Override // defpackage.e09
        public boolean internalMessageIsImmutable(Object obj) {
            return obj instanceof rvd;
        }

        @Override // defpackage.e09
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // defpackage.e09
        public boolean isRepeated() {
            return this.isRepeated;
        }
    }

    public static class e extends tk8 {
        final rvd containingTypeDefaultInstance;
        final Object defaultValue;
        final d descriptor;
        final rvd messageDefaultInstance;

        public e(rvd rvdVar, Object obj, rvd rvdVar2, d dVar, Class<?> cls) {
            if (rvdVar == null) {
                qp2.o("Null containingTypeDefaultInstance");
                throw null;
            }
            if (dVar.getLiteType() == j4o.a.MESSAGE && rvdVar2 == null) {
                qp2.o("Null messageDefaultInstance");
                throw null;
            }
            this.containingTypeDefaultInstance = rvdVar;
            this.defaultValue = obj;
            this.messageDefaultInstance = rvdVar2;
            this.descriptor = dVar;
        }

        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != j4o.b.ENUM) {
                return obj;
            }
            a7h a7hVar = new a7h();
            List list = (List) obj;
            a7hVar.ensureCapacity(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a7hVar.add(singularFromFieldSetType(it.next()));
            }
            a7hVar.makeImmutable();
            return a7hVar;
        }

        public rvd getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // defpackage.tk8
        public Object getDefaultValue() {
            return this.defaultValue;
        }

        @Override // defpackage.tk8
        public j4o.a getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // defpackage.tk8
        public rvd getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // defpackage.tk8
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // defpackage.tk8
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == j4o.b.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == j4o.b.ENUM ? Integer.valueOf(((xeb) obj).getNumber()) : obj;
        }

        public Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != j4o.b.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends c, BuilderType, T> e checkIsLite(tk8 tk8Var) {
        if (tk8Var.isLite()) {
            return (e) tk8Var;
        }
        qp2.o("Expected a lite extension.");
        return null;
    }

    private static <T extends gv9> T checkMessageInitialized(T t) throws bjb {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    private int computeSerializedSize(ani aniVar) {
        return aniVar == null ? x6h.getInstance().schemaFor((x6h) this).getSerializedSize(this) : aniVar.getSerializedSize(this);
    }

    public static veb emptyBooleanList() {
        return ln3.emptyList();
    }

    public static web emptyDoubleList() {
        return ee7.emptyList();
    }

    public static bfb emptyFloatList() {
        return q89.emptyList();
    }

    public static cfb emptyIntList() {
        return nbb.emptyList();
    }

    public static dfb emptyLongList() {
        return m0d.emptyList();
    }

    public static <E> ffb emptyProtobufList() {
        return a7h.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == dmm.getDefaultInstance()) {
            this.unknownFields = dmm.newInstance();
        }
    }

    public static <T extends gv9> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        Map<Class<?>, gv9> map = defaultInstanceMap;
        T t = (T) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) map.get(cls);
            } catch (ClassNotFoundException e2) {
                h9o.m("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((gv9) cnm.allocateInstance(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            map.put(cls, t2);
            return t2;
        }
        h9o.e();
        return null;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e2);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            h9o.s("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            h9o.s("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends gv9> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(f.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = x6h.getInstance().schemaFor((x6h) t).isInitialized(t);
        if (z) {
            t.dynamicMethod(f.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t : null, null);
        }
        return zIsInitialized;
    }

    public static bfb mutableCopy(bfb bfbVar) {
        return bfbVar.mutableCopyWithCapacity(bfbVar.size() << 1);
    }

    public static cfb mutableCopy(cfb cfbVar) {
        return cfbVar.mutableCopyWithCapacity(cfbVar.size() << 1);
    }

    public static dfb mutableCopy(dfb dfbVar) {
        return dfbVar.mutableCopyWithCapacity(dfbVar.size() << 1);
    }

    public static <E> ffb mutableCopy(ffb ffbVar) {
        return ffbVar.mutableCopyWithCapacity(ffbVar.size() << 1);
    }

    public static veb mutableCopy(veb vebVar) {
        return vebVar.mutableCopyWithCapacity(vebVar.size() << 1);
    }

    public static web mutableCopy(web webVar) {
        return webVar.mutableCopyWithCapacity(webVar.size() << 1);
    }

    public static Object newMessageInfo(rvd rvdVar, String str, Object[] objArr) {
        return new dkh(rvdVar, str, objArr);
    }

    public static <ContainingType extends rvd, Type> e newRepeatedGeneratedExtension(ContainingType containingtype, rvd rvdVar, zeb zebVar, int i, j4o.a aVar, boolean z, Class<?> cls) {
        return new e(containingtype, a7h.emptyList(), rvdVar, new d(zebVar, i, aVar, true, z), cls);
    }

    public static <ContainingType extends rvd, Type> e newSingularGeneratedExtension(ContainingType containingtype, Type type, rvd rvdVar, zeb zebVar, int i, j4o.a aVar, Class<?> cls) {
        return new e(containingtype, type, rvdVar, new d(zebVar, i, aVar, false, false), cls);
    }

    public static <T extends gv9> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, yk8.getEmptyRegistry()));
    }

    public static <T extends gv9> T parseDelimitedFrom(T t, InputStream inputStream, yk8 yk8Var) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, yk8Var));
    }

    public static <T extends gv9> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, r75.newInstance(inputStream), yk8.getEmptyRegistry()));
    }

    public static <T extends gv9> T parseFrom(T t, InputStream inputStream, yk8 yk8Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, r75.newInstance(inputStream), yk8Var));
    }

    public static <T extends gv9> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, yk8.getEmptyRegistry());
    }

    public static <T extends gv9> T parseFrom(T t, ByteBuffer byteBuffer, yk8 yk8Var) {
        return (T) checkMessageInitialized(parseFrom(t, r75.newInstance(byteBuffer), yk8Var));
    }

    public static <T extends gv9> T parseFrom(T t, r75 r75Var) {
        return (T) parseFrom(t, r75Var, yk8.getEmptyRegistry());
    }

    public static <T extends gv9> T parseFrom(T t, r75 r75Var, yk8 yk8Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, r75Var, yk8Var));
    }

    public static <T extends gv9> T parseFrom(T t, v44 v44Var) {
        return (T) checkMessageInitialized(parseFrom(t, v44Var, yk8.getEmptyRegistry()));
    }

    public static <T extends gv9> T parseFrom(T t, v44 v44Var, yk8 yk8Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, v44Var, yk8Var));
    }

    public static <T extends gv9> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, yk8.getEmptyRegistry()));
    }

    public static <T extends gv9> T parseFrom(T t, byte[] bArr, yk8 yk8Var) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, yk8Var));
    }

    private static <T extends gv9> T parsePartialDelimitedFrom(T t, InputStream inputStream, yk8 yk8Var) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            r75 r75VarNewInstance = r75.newInstance(new w5.a.C0001a(inputStream, r75.readRawVarint32(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, r75VarNewInstance, yk8Var);
            try {
                r75VarNewInstance.checkLastTagWas(0);
                return t2;
            } catch (bjb e2) {
                throw e2.setUnfinishedMessage(t2);
            }
        } catch (bjb e3) {
            if (e3.getThrownFromInputStream()) {
                throw new bjb((IOException) e3);
            }
            throw e3;
        } catch (IOException e4) {
            throw new bjb(e4);
        }
    }

    public static <T extends gv9> T parsePartialFrom(T t, r75 r75Var) {
        return (T) parsePartialFrom(t, r75Var, yk8.getEmptyRegistry());
    }

    public static <T extends gv9> T parsePartialFrom(T t, r75 r75Var, yk8 yk8Var) throws bjb {
        T t2 = (T) t.newMutableInstance();
        try {
            ani aniVarSchemaFor = x6h.getInstance().schemaFor((x6h) t2);
            aniVarSchemaFor.mergeFrom(t2, u75.forCodedInput(r75Var), yk8Var);
            aniVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (bjb e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new bjb((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof bjb) {
                throw ((bjb) e3.getCause());
            }
            throw new bjb(e3).setUnfinishedMessage(t2);
        } catch (zkm e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof bjb) {
                throw ((bjb) e5.getCause());
            }
            throw e5;
        }
    }

    private static <T extends gv9> T parsePartialFrom(T t, v44 v44Var, yk8 yk8Var) throws bjb {
        r75 r75VarNewCodedInput = v44Var.newCodedInput();
        T t2 = (T) parsePartialFrom(t, r75VarNewCodedInput, yk8Var);
        try {
            r75VarNewCodedInput.checkLastTagWas(0);
            return t2;
        } catch (bjb e2) {
            throw e2.setUnfinishedMessage(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends gv9> T parsePartialFrom(T t, byte[] bArr, int i, int i2, yk8 yk8Var) throws bjb {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            ani aniVarSchemaFor = x6h.getInstance().schemaFor((x6h) t2);
            aniVarSchemaFor.mergeFrom(t2, bArr, i, i + i2, new g72.a(yk8Var));
            aniVarSchemaFor.makeImmutable(t2);
            return t2;
        } catch (bjb e2) {
            bjb bjbVar = e2;
            if (bjbVar.getThrownFromInputStream()) {
                bjbVar = new bjb((IOException) bjbVar);
            }
            throw bjbVar.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof bjb) {
                throw ((bjb) e3.getCause());
            }
            throw new bjb(e3).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw bjb.truncatedMessage().setUnfinishedMessage(t2);
        } catch (zkm e4) {
            throw e4.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        }
    }

    public static <T extends gv9> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public final Object buildMessageInfo() {
        return dynamicMethod(f.BUILD_MESSAGE_INFO, null, null);
    }

    public final void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public final void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public final int computeHashCode() {
        return x6h.getInstance().schemaFor((x6h) this).hashCode(this);
    }

    public final <MessageType2 extends gv9, BuilderType2 extends a> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(f.NEW_BUILDER, null, null);
    }

    public final <MessageType2 extends gv9, BuilderType2 extends a> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((gv9) messagetype2);
    }

    public abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return x6h.getInstance().schemaFor((x6h) this).equals(this, (gv9) obj);
        }
        return false;
    }

    @Override // defpackage.w5, defpackage.rvd, defpackage.svd
    public final gv9 getDefaultInstanceForType() {
        return (gv9) dynamicMethod(f.GET_DEFAULT_INSTANCE, null, null);
    }

    public final int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // defpackage.w5
    public final int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // defpackage.w5, defpackage.rvd
    public final p1g getParserForType() {
        return (p1g) dynamicMethod(f.GET_PARSER, null, null);
    }

    @Override // defpackage.w5, defpackage.rvd
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // defpackage.w5
    public int getSerializedSize(ani aniVar) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(aniVar);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            qp2.n(sko.i(iComputeSerializedSize, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(aniVar);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public final boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // defpackage.w5, defpackage.rvd, defpackage.svd
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public final boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void makeImmutable() {
        x6h.getInstance().schemaFor((x6h) this).makeImmutable(this);
        markImmutable();
    }

    public final void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final void mergeLengthDelimitedField(int i, v44 v44Var) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, v44Var);
    }

    public final void mergeUnknownFields(dmm dmmVar) {
        this.unknownFields = dmm.mutableCopyOf(this.unknownFields, dmmVar);
    }

    public final void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    @Override // defpackage.w5, defpackage.rvd
    public final a newBuilderForType() {
        return (a) dynamicMethod(f.NEW_BUILDER, null, null);
    }

    public final gv9 newMutableInstance() {
        return (gv9) dynamicMethod(f.NEW_MUTABLE_INSTANCE, null, null);
    }

    public final boolean parseUnknownField(int i, r75 r75Var) {
        if (j4o.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, r75Var);
    }

    public final void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // defpackage.w5
    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (this.memoizedSerializedSize & Integer.MIN_VALUE) | (i & Integer.MAX_VALUE);
        } else {
            qp2.n(sko.i(i, "serialized size must be non-negative, was "));
        }
    }

    @Override // defpackage.w5, defpackage.rvd
    public final a toBuilder() {
        return ((a) dynamicMethod(f.NEW_BUILDER, null, null)).mergeFrom(this);
    }

    public String toString() {
        return vvd.toString(this, super.toString());
    }

    @Override // defpackage.w5, defpackage.rvd
    public void writeTo(y75 y75Var) {
        x6h.getInstance().schemaFor((x6h) this).writeTo(this, a85.forCodedOutput(y75Var));
    }
}
