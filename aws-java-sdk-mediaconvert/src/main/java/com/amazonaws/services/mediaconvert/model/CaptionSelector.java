/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Caption inputs to be mapped to caption outputs.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the
     * caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or
     * PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field
     * (and PID field); there is no way to extract a specific language with pass-through captions.
     */
    private String languageCode;

    private CaptionSourceSettings sourceSettings;

    /**
     * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the
     * caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or
     * PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field
     * (and PID field); there is no way to extract a specific language with pass-through captions.
     * 
     * @param languageCode
     *        The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to
     *        select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete
     *        this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed
     *        through, omit this field (and PID field); there is no way to extract a specific language with pass-through
     *        captions.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the
     * caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or
     * PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field
     * (and PID field); there is no way to extract a specific language with pass-through captions.
     * 
     * @return The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to
     *         select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete
     *         this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed
     *         through, omit this field (and PID field); there is no way to extract a specific language with
     *         pass-through captions.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the
     * caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or
     * PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field
     * (and PID field); there is no way to extract a specific language with pass-through captions.
     * 
     * @param languageCode
     *        The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to
     *        select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete
     *        this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed
     *        through, omit this field (and PID field); there is no way to extract a specific language with pass-through
     *        captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionSelector withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the
     * caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or
     * PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field
     * (and PID field); there is no way to extract a specific language with pass-through captions.
     * 
     * @param languageCode
     *        The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to
     *        select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete
     *        this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed
     *        through, omit this field (and PID field); there is no way to extract a specific language with pass-through
     *        captions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CaptionSelector withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * @param sourceSettings
     */

    public void setSourceSettings(CaptionSourceSettings sourceSettings) {
        this.sourceSettings = sourceSettings;
    }

    /**
     * @return
     */

    public CaptionSourceSettings getSourceSettings() {
        return this.sourceSettings;
    }

    /**
     * @param sourceSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelector withSourceSettings(CaptionSourceSettings sourceSettings) {
        setSourceSettings(sourceSettings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getSourceSettings() != null)
            sb.append("SourceSettings: ").append(getSourceSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSelector == false)
            return false;
        CaptionSelector other = (CaptionSelector) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getSourceSettings() == null ^ this.getSourceSettings() == null)
            return false;
        if (other.getSourceSettings() != null && other.getSourceSettings().equals(this.getSourceSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getSourceSettings() == null) ? 0 : getSourceSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSelector clone() {
        try {
            return (CaptionSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
