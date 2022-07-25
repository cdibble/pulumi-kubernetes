// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.outputs;

import com.google.gson.JsonElement;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.v1.outputs.ExternalDocumentationPatch;
import com.pulumi.kubernetes.apiextensions.v1.outputs.JSONSchemaProps;
import com.pulumi.kubernetes.apiextensions.v1.outputs.ValidationRulePatch;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JSONSchemaPropsPatch {
    private @Nullable String $ref;
    private @Nullable String $schema;
    private @Nullable Either<JSONSchemaProps,Boolean> additionalItems;
    private @Nullable Either<JSONSchemaProps,Boolean> additionalProperties;
    private @Nullable List<JSONSchemaPropsPatch> allOf;
    private @Nullable List<JSONSchemaPropsPatch> anyOf;
    /**
     * @return default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     * 
     */
    private @Nullable JsonElement default_;
    private @Nullable Map<String,JSONSchemaProps> definitions;
    private @Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies;
    private @Nullable String description;
    private @Nullable List<JsonElement> enum_;
    private @Nullable JsonElement example;
    private @Nullable Boolean exclusiveMaximum;
    private @Nullable Boolean exclusiveMinimum;
    private @Nullable ExternalDocumentationPatch externalDocs;
    /**
     * @return format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
     * 
     * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like &#34;0321751043&#34; or &#34;978-0321751041&#34; - isbn10: an ISBN10 number string like &#34;0321751043&#34; - isbn13: an ISBN13 number string like &#34;978-0321751041&#34; - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like &#34;#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like &#34;rgb(255,255,2559&#34; - byte: base64 encoded binary data - password: any kind of string - date: a date string like &#34;2006-01-02&#34; as defined by full-date in RFC3339 - duration: a duration string like &#34;22 ns&#34; as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like &#34;2014-12-15T19:30:20.000Z&#34; as defined by date-time in RFC3339.
     * 
     */
    private @Nullable String format;
    private @Nullable String id;
    private @Nullable Either<JSONSchemaProps,List<JsonElement>> items;
    private @Nullable Integer maxItems;
    private @Nullable Integer maxLength;
    private @Nullable Integer maxProperties;
    private @Nullable Double maximum;
    private @Nullable Integer minItems;
    private @Nullable Integer minLength;
    private @Nullable Integer minProperties;
    private @Nullable Double minimum;
    private @Nullable Double multipleOf;
    private @Nullable JSONSchemaPropsPatch not;
    private @Nullable Boolean nullable;
    private @Nullable List<JSONSchemaPropsPatch> oneOf;
    private @Nullable String pattern;
    private @Nullable Map<String,JSONSchemaProps> patternProperties;
    private @Nullable Map<String,JSONSchemaProps> properties;
    private @Nullable List<String> required;
    private @Nullable String title;
    private @Nullable String type;
    private @Nullable Boolean uniqueItems;
    /**
     * @return x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
     * 
     */
    private @Nullable Boolean x_kubernetes_embedded_resource;
    /**
     * @return x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
     * 
     * 1) anyOf:
     *    - type: integer
     *    - type: string
     * 2) allOf:
     *    - anyOf:
     *      - type: integer
     *      - type: string
     *    - ... zero or more
     * 
     */
    private @Nullable Boolean x_kubernetes_int_or_string;
    /**
     * @return x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
     * 
     * This tag MUST only be used on lists that have the &#34;x-kubernetes-list-type&#34; extension set to &#34;map&#34;. Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
     * 
     * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
     * 
     */
    private @Nullable List<String> x_kubernetes_list_map_keys;
    /**
     * @return x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
     * 
     * 1) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic lists will be entirely replaced when updated. This extension
     *      may be used on any type of list (struct, scalar, ...).
     * 2) `set`:
     *      Sets are lists that must not have multiple items with the same value. Each
     *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
     *      array with x-kubernetes-list-type `atomic`.
     * 3) `map`:
     *      These lists are like maps in that their elements have a non-index key
     *      used to identify them. Order is preserved upon merge. The map tag
     *      must only be used on a list with elements of type object.
     *    Defaults to atomic for arrays.
     * 
     */
    private @Nullable String x_kubernetes_list_type;
    /**
     * @return x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
     * 
     * 1) `granular`:
     *      These maps are actual maps (key-value pairs) and each fields are independent
     *      from each other (they can each be manipulated by separate actors). This is
     *      the default behaviour for all maps.
     * 2) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic maps will be entirely replaced when updated.
     * 
     */
    private @Nullable String x_kubernetes_map_type;
    /**
     * @return x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
     * 
     */
    private @Nullable Boolean x_kubernetes_preserve_unknown_fields;
    /**
     * @return x-kubernetes-validations describes a list of validation rules written in the CEL expression language. This field is an alpha-level. Using this field requires the feature gate `CustomResourceValidationExpressions` to be enabled.
     * 
     */
    private @Nullable List<ValidationRulePatch> x_kubernetes_validations;

    private JSONSchemaPropsPatch() {}
    public Optional<String> $ref() {
        return Optional.ofNullable(this.$ref);
    }
    public Optional<String> $schema() {
        return Optional.ofNullable(this.$schema);
    }
    public Optional<Either<JSONSchemaProps,Boolean>> additionalItems() {
        return Optional.ofNullable(this.additionalItems);
    }
    public Optional<Either<JSONSchemaProps,Boolean>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }
    public List<JSONSchemaPropsPatch> allOf() {
        return this.allOf == null ? List.of() : this.allOf;
    }
    public List<JSONSchemaPropsPatch> anyOf() {
        return this.anyOf == null ? List.of() : this.anyOf;
    }
    /**
     * @return default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
     * 
     */
    public Optional<JsonElement> default_() {
        return Optional.ofNullable(this.default_);
    }
    public Map<String,JSONSchemaProps> definitions() {
        return this.definitions == null ? Map.of() : this.definitions;
    }
    public Map<String,Either<JSONSchemaProps,List<String>>> dependencies() {
        return this.dependencies == null ? Map.of() : this.dependencies;
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public List<JsonElement> enum_() {
        return this.enum_ == null ? List.of() : this.enum_;
    }
    public Optional<JsonElement> example() {
        return Optional.ofNullable(this.example);
    }
    public Optional<Boolean> exclusiveMaximum() {
        return Optional.ofNullable(this.exclusiveMaximum);
    }
    public Optional<Boolean> exclusiveMinimum() {
        return Optional.ofNullable(this.exclusiveMinimum);
    }
    public Optional<ExternalDocumentationPatch> externalDocs() {
        return Optional.ofNullable(this.externalDocs);
    }
    /**
     * @return format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
     * 
     * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like &#34;0321751043&#34; or &#34;978-0321751041&#34; - isbn10: an ISBN10 number string like &#34;0321751043&#34; - isbn13: an ISBN13 number string like &#34;978-0321751041&#34; - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like &#34;#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like &#34;rgb(255,255,2559&#34; - byte: base64 encoded binary data - password: any kind of string - date: a date string like &#34;2006-01-02&#34; as defined by full-date in RFC3339 - duration: a duration string like &#34;22 ns&#34; as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like &#34;2014-12-15T19:30:20.000Z&#34; as defined by date-time in RFC3339.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Either<JSONSchemaProps,List<JsonElement>>> items() {
        return Optional.ofNullable(this.items);
    }
    public Optional<Integer> maxItems() {
        return Optional.ofNullable(this.maxItems);
    }
    public Optional<Integer> maxLength() {
        return Optional.ofNullable(this.maxLength);
    }
    public Optional<Integer> maxProperties() {
        return Optional.ofNullable(this.maxProperties);
    }
    public Optional<Double> maximum() {
        return Optional.ofNullable(this.maximum);
    }
    public Optional<Integer> minItems() {
        return Optional.ofNullable(this.minItems);
    }
    public Optional<Integer> minLength() {
        return Optional.ofNullable(this.minLength);
    }
    public Optional<Integer> minProperties() {
        return Optional.ofNullable(this.minProperties);
    }
    public Optional<Double> minimum() {
        return Optional.ofNullable(this.minimum);
    }
    public Optional<Double> multipleOf() {
        return Optional.ofNullable(this.multipleOf);
    }
    public Optional<JSONSchemaPropsPatch> not() {
        return Optional.ofNullable(this.not);
    }
    public Optional<Boolean> nullable() {
        return Optional.ofNullable(this.nullable);
    }
    public List<JSONSchemaPropsPatch> oneOf() {
        return this.oneOf == null ? List.of() : this.oneOf;
    }
    public Optional<String> pattern() {
        return Optional.ofNullable(this.pattern);
    }
    public Map<String,JSONSchemaProps> patternProperties() {
        return this.patternProperties == null ? Map.of() : this.patternProperties;
    }
    public Map<String,JSONSchemaProps> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public List<String> required() {
        return this.required == null ? List.of() : this.required;
    }
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<Boolean> uniqueItems() {
        return Optional.ofNullable(this.uniqueItems);
    }
    /**
     * @return x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
     * 
     */
    public Optional<Boolean> x_kubernetes_embedded_resource() {
        return Optional.ofNullable(this.x_kubernetes_embedded_resource);
    }
    /**
     * @return x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
     * 
     * 1) anyOf:
     *    - type: integer
     *    - type: string
     * 2) allOf:
     *    - anyOf:
     *      - type: integer
     *      - type: string
     *    - ... zero or more
     * 
     */
    public Optional<Boolean> x_kubernetes_int_or_string() {
        return Optional.ofNullable(this.x_kubernetes_int_or_string);
    }
    /**
     * @return x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
     * 
     * This tag MUST only be used on lists that have the &#34;x-kubernetes-list-type&#34; extension set to &#34;map&#34;. Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
     * 
     * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
     * 
     */
    public List<String> x_kubernetes_list_map_keys() {
        return this.x_kubernetes_list_map_keys == null ? List.of() : this.x_kubernetes_list_map_keys;
    }
    /**
     * @return x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
     * 
     * 1) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic lists will be entirely replaced when updated. This extension
     *      may be used on any type of list (struct, scalar, ...).
     * 2) `set`:
     *      Sets are lists that must not have multiple items with the same value. Each
     *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
     *      array with x-kubernetes-list-type `atomic`.
     * 3) `map`:
     *      These lists are like maps in that their elements have a non-index key
     *      used to identify them. Order is preserved upon merge. The map tag
     *      must only be used on a list with elements of type object.
     *    Defaults to atomic for arrays.
     * 
     */
    public Optional<String> x_kubernetes_list_type() {
        return Optional.ofNullable(this.x_kubernetes_list_type);
    }
    /**
     * @return x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
     * 
     * 1) `granular`:
     *      These maps are actual maps (key-value pairs) and each fields are independent
     *      from each other (they can each be manipulated by separate actors). This is
     *      the default behaviour for all maps.
     * 2) `atomic`: the list is treated as a single entity, like a scalar.
     *      Atomic maps will be entirely replaced when updated.
     * 
     */
    public Optional<String> x_kubernetes_map_type() {
        return Optional.ofNullable(this.x_kubernetes_map_type);
    }
    /**
     * @return x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
     * 
     */
    public Optional<Boolean> x_kubernetes_preserve_unknown_fields() {
        return Optional.ofNullable(this.x_kubernetes_preserve_unknown_fields);
    }
    /**
     * @return x-kubernetes-validations describes a list of validation rules written in the CEL expression language. This field is an alpha-level. Using this field requires the feature gate `CustomResourceValidationExpressions` to be enabled.
     * 
     */
    public List<ValidationRulePatch> x_kubernetes_validations() {
        return this.x_kubernetes_validations == null ? List.of() : this.x_kubernetes_validations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JSONSchemaPropsPatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String $ref;
        private @Nullable String $schema;
        private @Nullable Either<JSONSchemaProps,Boolean> additionalItems;
        private @Nullable Either<JSONSchemaProps,Boolean> additionalProperties;
        private @Nullable List<JSONSchemaPropsPatch> allOf;
        private @Nullable List<JSONSchemaPropsPatch> anyOf;
        private @Nullable JsonElement default_;
        private @Nullable Map<String,JSONSchemaProps> definitions;
        private @Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies;
        private @Nullable String description;
        private @Nullable List<JsonElement> enum_;
        private @Nullable JsonElement example;
        private @Nullable Boolean exclusiveMaximum;
        private @Nullable Boolean exclusiveMinimum;
        private @Nullable ExternalDocumentationPatch externalDocs;
        private @Nullable String format;
        private @Nullable String id;
        private @Nullable Either<JSONSchemaProps,List<JsonElement>> items;
        private @Nullable Integer maxItems;
        private @Nullable Integer maxLength;
        private @Nullable Integer maxProperties;
        private @Nullable Double maximum;
        private @Nullable Integer minItems;
        private @Nullable Integer minLength;
        private @Nullable Integer minProperties;
        private @Nullable Double minimum;
        private @Nullable Double multipleOf;
        private @Nullable JSONSchemaPropsPatch not;
        private @Nullable Boolean nullable;
        private @Nullable List<JSONSchemaPropsPatch> oneOf;
        private @Nullable String pattern;
        private @Nullable Map<String,JSONSchemaProps> patternProperties;
        private @Nullable Map<String,JSONSchemaProps> properties;
        private @Nullable List<String> required;
        private @Nullable String title;
        private @Nullable String type;
        private @Nullable Boolean uniqueItems;
        private @Nullable Boolean x_kubernetes_embedded_resource;
        private @Nullable Boolean x_kubernetes_int_or_string;
        private @Nullable List<String> x_kubernetes_list_map_keys;
        private @Nullable String x_kubernetes_list_type;
        private @Nullable String x_kubernetes_map_type;
        private @Nullable Boolean x_kubernetes_preserve_unknown_fields;
        private @Nullable List<ValidationRulePatch> x_kubernetes_validations;
        public Builder() {}
        public Builder(JSONSchemaPropsPatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$ref = defaults.$ref;
    	      this.$schema = defaults.$schema;
    	      this.additionalItems = defaults.additionalItems;
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.allOf = defaults.allOf;
    	      this.anyOf = defaults.anyOf;
    	      this.default_ = defaults.default_;
    	      this.definitions = defaults.definitions;
    	      this.dependencies = defaults.dependencies;
    	      this.description = defaults.description;
    	      this.enum_ = defaults.enum_;
    	      this.example = defaults.example;
    	      this.exclusiveMaximum = defaults.exclusiveMaximum;
    	      this.exclusiveMinimum = defaults.exclusiveMinimum;
    	      this.externalDocs = defaults.externalDocs;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.items = defaults.items;
    	      this.maxItems = defaults.maxItems;
    	      this.maxLength = defaults.maxLength;
    	      this.maxProperties = defaults.maxProperties;
    	      this.maximum = defaults.maximum;
    	      this.minItems = defaults.minItems;
    	      this.minLength = defaults.minLength;
    	      this.minProperties = defaults.minProperties;
    	      this.minimum = defaults.minimum;
    	      this.multipleOf = defaults.multipleOf;
    	      this.not = defaults.not;
    	      this.nullable = defaults.nullable;
    	      this.oneOf = defaults.oneOf;
    	      this.pattern = defaults.pattern;
    	      this.patternProperties = defaults.patternProperties;
    	      this.properties = defaults.properties;
    	      this.required = defaults.required;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
    	      this.uniqueItems = defaults.uniqueItems;
    	      this.x_kubernetes_embedded_resource = defaults.x_kubernetes_embedded_resource;
    	      this.x_kubernetes_int_or_string = defaults.x_kubernetes_int_or_string;
    	      this.x_kubernetes_list_map_keys = defaults.x_kubernetes_list_map_keys;
    	      this.x_kubernetes_list_type = defaults.x_kubernetes_list_type;
    	      this.x_kubernetes_map_type = defaults.x_kubernetes_map_type;
    	      this.x_kubernetes_preserve_unknown_fields = defaults.x_kubernetes_preserve_unknown_fields;
    	      this.x_kubernetes_validations = defaults.x_kubernetes_validations;
        }

        @CustomType.Setter
        public Builder $ref(@Nullable String $ref) {
            this.$ref = $ref;
            return this;
        }
        @CustomType.Setter
        public Builder $schema(@Nullable String $schema) {
            this.$schema = $schema;
            return this;
        }
        @CustomType.Setter
        public Builder additionalItems(@Nullable Either<JSONSchemaProps,Boolean> additionalItems) {
            this.additionalItems = additionalItems;
            return this;
        }
        @CustomType.Setter
        public Builder additionalProperties(@Nullable Either<JSONSchemaProps,Boolean> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }
        @CustomType.Setter
        public Builder allOf(@Nullable List<JSONSchemaPropsPatch> allOf) {
            this.allOf = allOf;
            return this;
        }
        public Builder allOf(JSONSchemaPropsPatch... allOf) {
            return allOf(List.of(allOf));
        }
        @CustomType.Setter
        public Builder anyOf(@Nullable List<JSONSchemaPropsPatch> anyOf) {
            this.anyOf = anyOf;
            return this;
        }
        public Builder anyOf(JSONSchemaPropsPatch... anyOf) {
            return anyOf(List.of(anyOf));
        }
        @CustomType.Setter("default")
        public Builder default_(@Nullable JsonElement default_) {
            this.default_ = default_;
            return this;
        }
        @CustomType.Setter
        public Builder definitions(@Nullable Map<String,JSONSchemaProps> definitions) {
            this.definitions = definitions;
            return this;
        }
        @CustomType.Setter
        public Builder dependencies(@Nullable Map<String,Either<JSONSchemaProps,List<String>>> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter("enum")
        public Builder enum_(@Nullable List<JsonElement> enum_) {
            this.enum_ = enum_;
            return this;
        }
        public Builder enum_(JsonElement... enum_) {
            return enum_(List.of(enum_));
        }
        @CustomType.Setter
        public Builder example(@Nullable JsonElement example) {
            this.example = example;
            return this;
        }
        @CustomType.Setter
        public Builder exclusiveMaximum(@Nullable Boolean exclusiveMaximum) {
            this.exclusiveMaximum = exclusiveMaximum;
            return this;
        }
        @CustomType.Setter
        public Builder exclusiveMinimum(@Nullable Boolean exclusiveMinimum) {
            this.exclusiveMinimum = exclusiveMinimum;
            return this;
        }
        @CustomType.Setter
        public Builder externalDocs(@Nullable ExternalDocumentationPatch externalDocs) {
            this.externalDocs = externalDocs;
            return this;
        }
        @CustomType.Setter
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder items(@Nullable Either<JSONSchemaProps,List<JsonElement>> items) {
            this.items = items;
            return this;
        }
        @CustomType.Setter
        public Builder maxItems(@Nullable Integer maxItems) {
            this.maxItems = maxItems;
            return this;
        }
        @CustomType.Setter
        public Builder maxLength(@Nullable Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        @CustomType.Setter
        public Builder maxProperties(@Nullable Integer maxProperties) {
            this.maxProperties = maxProperties;
            return this;
        }
        @CustomType.Setter
        public Builder maximum(@Nullable Double maximum) {
            this.maximum = maximum;
            return this;
        }
        @CustomType.Setter
        public Builder minItems(@Nullable Integer minItems) {
            this.minItems = minItems;
            return this;
        }
        @CustomType.Setter
        public Builder minLength(@Nullable Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        @CustomType.Setter
        public Builder minProperties(@Nullable Integer minProperties) {
            this.minProperties = minProperties;
            return this;
        }
        @CustomType.Setter
        public Builder minimum(@Nullable Double minimum) {
            this.minimum = minimum;
            return this;
        }
        @CustomType.Setter
        public Builder multipleOf(@Nullable Double multipleOf) {
            this.multipleOf = multipleOf;
            return this;
        }
        @CustomType.Setter
        public Builder not(@Nullable JSONSchemaPropsPatch not) {
            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder nullable(@Nullable Boolean nullable) {
            this.nullable = nullable;
            return this;
        }
        @CustomType.Setter
        public Builder oneOf(@Nullable List<JSONSchemaPropsPatch> oneOf) {
            this.oneOf = oneOf;
            return this;
        }
        public Builder oneOf(JSONSchemaPropsPatch... oneOf) {
            return oneOf(List.of(oneOf));
        }
        @CustomType.Setter
        public Builder pattern(@Nullable String pattern) {
            this.pattern = pattern;
            return this;
        }
        @CustomType.Setter
        public Builder patternProperties(@Nullable Map<String,JSONSchemaProps> patternProperties) {
            this.patternProperties = patternProperties;
            return this;
        }
        @CustomType.Setter
        public Builder properties(@Nullable Map<String,JSONSchemaProps> properties) {
            this.properties = properties;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable List<String> required) {
            this.required = required;
            return this;
        }
        public Builder required(String... required) {
            return required(List.of(required));
        }
        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uniqueItems(@Nullable Boolean uniqueItems) {
            this.uniqueItems = uniqueItems;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_embedded_resource(@Nullable Boolean x_kubernetes_embedded_resource) {
            this.x_kubernetes_embedded_resource = x_kubernetes_embedded_resource;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_int_or_string(@Nullable Boolean x_kubernetes_int_or_string) {
            this.x_kubernetes_int_or_string = x_kubernetes_int_or_string;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_list_map_keys(@Nullable List<String> x_kubernetes_list_map_keys) {
            this.x_kubernetes_list_map_keys = x_kubernetes_list_map_keys;
            return this;
        }
        public Builder x_kubernetes_list_map_keys(String... x_kubernetes_list_map_keys) {
            return x_kubernetes_list_map_keys(List.of(x_kubernetes_list_map_keys));
        }
        @CustomType.Setter
        public Builder x_kubernetes_list_type(@Nullable String x_kubernetes_list_type) {
            this.x_kubernetes_list_type = x_kubernetes_list_type;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_map_type(@Nullable String x_kubernetes_map_type) {
            this.x_kubernetes_map_type = x_kubernetes_map_type;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_preserve_unknown_fields(@Nullable Boolean x_kubernetes_preserve_unknown_fields) {
            this.x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields;
            return this;
        }
        @CustomType.Setter
        public Builder x_kubernetes_validations(@Nullable List<ValidationRulePatch> x_kubernetes_validations) {
            this.x_kubernetes_validations = x_kubernetes_validations;
            return this;
        }
        public Builder x_kubernetes_validations(ValidationRulePatch... x_kubernetes_validations) {
            return x_kubernetes_validations(List.of(x_kubernetes_validations));
        }
        public JSONSchemaPropsPatch build() {
            final var o = new JSONSchemaPropsPatch();
            o.$ref = $ref;
            o.$schema = $schema;
            o.additionalItems = additionalItems;
            o.additionalProperties = additionalProperties;
            o.allOf = allOf;
            o.anyOf = anyOf;
            o.default_ = default_;
            o.definitions = definitions;
            o.dependencies = dependencies;
            o.description = description;
            o.enum_ = enum_;
            o.example = example;
            o.exclusiveMaximum = exclusiveMaximum;
            o.exclusiveMinimum = exclusiveMinimum;
            o.externalDocs = externalDocs;
            o.format = format;
            o.id = id;
            o.items = items;
            o.maxItems = maxItems;
            o.maxLength = maxLength;
            o.maxProperties = maxProperties;
            o.maximum = maximum;
            o.minItems = minItems;
            o.minLength = minLength;
            o.minProperties = minProperties;
            o.minimum = minimum;
            o.multipleOf = multipleOf;
            o.not = not;
            o.nullable = nullable;
            o.oneOf = oneOf;
            o.pattern = pattern;
            o.patternProperties = patternProperties;
            o.properties = properties;
            o.required = required;
            o.title = title;
            o.type = type;
            o.uniqueItems = uniqueItems;
            o.x_kubernetes_embedded_resource = x_kubernetes_embedded_resource;
            o.x_kubernetes_int_or_string = x_kubernetes_int_or_string;
            o.x_kubernetes_list_map_keys = x_kubernetes_list_map_keys;
            o.x_kubernetes_list_type = x_kubernetes_list_type;
            o.x_kubernetes_map_type = x_kubernetes_map_type;
            o.x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields;
            o.x_kubernetes_validations = x_kubernetes_validations;
            return o;
        }
    }
}
