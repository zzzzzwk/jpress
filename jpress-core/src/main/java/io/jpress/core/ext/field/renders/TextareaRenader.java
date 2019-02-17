/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.core.ext.field.renders;

import io.jpress.core.ext.field.ExtField;
import io.jpress.core.ext.field.ExtFieldRender;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Title: Textarea 的渲染器
 */
public class TextareaRenader implements ExtFieldRender {

    protected static String template = "" +
            "<div class=\"form-group\">\n" +
            "<label class=\"col-sm-2 control-label\">{label}</label>\n" +
            "<div class=\"col-sm-6\">\n" +
            "    <textarea class=\"form-control\" \n" +
            "       id=\"{id}\"\n" +
            "       name=\"{name}\"\n" +
            "       placeholder=\"{placeholder}\" {attrs}>{value}</textarea>\n" +
            "    <p class=\"help-block\">{helpText}</p>\n" +
            "</div>\n" +
            "</div>";

    @Override
    public String onRender(ExtField field, Object value) {
        return template.replace("{label}", field.getLabel())
                .replace("{id}", field.getId())
                .replace("{name}", field.getName())
                .replace("{placeholder}", field.getPlaceholder())
                .replace("{value}", value == null ? field.getValue() : value.toString())
                .replace("{helpText}", field.getHelpText())
                .replace("{attrs}", field.getAttrs());
    }
}
