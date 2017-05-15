# Java8Practice java.time

time包中的是类是不可变且线程安全的。新的时间及日期API位于java.time中，下面是一些关键类

Instant——它代表的是时间戳

LocalDate——不包含具体时间的日期，比如2014-01-14。它可以用来存储生日，周年纪念日，入职日期等。

LocalTime——它代表的是不含日期的时间

LocalDateTime——它包含了日期及时间，不过还是没有偏移信息或者说时区。

ZonedDateTime——这是一个包含时区的完整的日期时间，偏移量是以UTC/格林威治时间为基准的。

