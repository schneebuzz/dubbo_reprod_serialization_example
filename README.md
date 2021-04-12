**Example project to reproduce dubbo one-way only kryo serialization**

Run provider app and then run consumer App.

The consumer App can call `getData()` and the provider will serialize and provide it.
However, when calling `setData()` the serialization fails.
