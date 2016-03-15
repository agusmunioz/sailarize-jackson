package com.github.sailarize.jackson.mixin;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sailarize.form.MultilectInput;
import com.github.sailarize.form.Option;

/**
 * A Mixin that holds the Jackson serialization configuration for
 * {@link MultilectInput}.
 * 
 * @author agusmunioz
 *
 */
@JsonInclude(Include.NON_NULL)
public interface MultilectInputMixin {

	@JsonProperty("multilect")
	Collection<Option> getOptions();
}
