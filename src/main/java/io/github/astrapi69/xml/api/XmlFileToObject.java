package io.github.astrapi69.xml.api;

import java.io.File;

import lombok.NonNull;

/**
 * If a class implements the interface {@link XmlFileToObject} can transform a xml file to an object
 */
public interface XmlFileToObject
{
	/**
	 * Transforms the given xml string to an Object of type T
	 *
	 * @param <T>
	 *            the generic type of the return type
	 * @param xmlFile
	 *            the xml file
	 * @param clazz
	 *            the class from the object that will be returned
	 * @return the Object
	 */
	<T> T toObject(final @NonNull File xmlFile, final @NonNull Class<T> clazz);
}
