
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/choosers/file_chooser.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class FileChooserParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class Mode {


        public static final int OPEN = 0;

        public static final int OPEN_MULTIPLE = OPEN + 1;

        public static final int UPLOAD_FOLDER = OPEN_MULTIPLE + 1;

        public static final int SAVE = UPLOAD_FOLDER + 1;

        public static final int MIN_VALUE = (int) (0);
        public static final int MAX_VALUE = (int) (3);

        private static final boolean IS_EXTENSIBLE = false;

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 3:
                    return true;
            }
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value))
                return;

            throw new DeserializationException("Invalid enum value.");
        }

        private Mode() {}

    }
    public int mode;
    public org.chromium.mojo_base.mojom.String16 title;
    public org.chromium.mojo_base.mojom.FilePath defaultFileName;
    public org.chromium.mojo_base.mojom.FilePath[] selectedFiles;
    public org.chromium.mojo_base.mojom.String16[] acceptTypes;
    public boolean needLocalPath;
    public boolean useMediaCapture;
    public org.chromium.url.mojom.Url requestor;

    private FileChooserParams(int version) {
        super(STRUCT_SIZE, version);
        this.mode = (int) FileChooserParams.Mode.OPEN;
        this.needLocalPath = (boolean) true;
        this.useMediaCapture = (boolean) false;
    }

    public FileChooserParams() {
        this(0);
    }

    public static FileChooserParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FileChooserParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FileChooserParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FileChooserParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FileChooserParams(elementsOrVersion);
                {
                    
                result.mode = decoder0.readInt(8);
                    FileChooserParams.Mode.validate(result.mode);
                }
                {
                    
                result.needLocalPath = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.useMediaCapture = decoder0.readBoolean(12, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.title = org.chromium.mojo_base.mojom.String16.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.defaultFileName = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.selectedFiles = new org.chromium.mojo_base.mojom.FilePath[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.selectedFiles[i1] = org.chromium.mojo_base.mojom.FilePath.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.acceptTypes = new org.chromium.mojo_base.mojom.String16[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.acceptTypes[i1] = org.chromium.mojo_base.mojom.String16.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.requestor = org.chromium.url.mojom.Url.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.mode, 8);
        
        encoder0.encode(this.needLocalPath, 12, 0);
        
        encoder0.encode(this.useMediaCapture, 12, 1);
        
        encoder0.encode(this.title, 16, false);
        
        encoder0.encode(this.defaultFileName, 24, false);
        
        if (this.selectedFiles == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.selectedFiles.length, 32, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.selectedFiles.length; ++i0) {
                
                encoder1.encode(this.selectedFiles[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        if (this.acceptTypes == null) {
            encoder0.encodeNullPointer(40, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.acceptTypes.length, 40, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.acceptTypes.length; ++i0) {
                
                encoder1.encode(this.acceptTypes[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.requestor, 48, false);
    }
}