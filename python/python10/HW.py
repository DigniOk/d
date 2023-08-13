import json
import uuid
import sys
import codecs
from datetime import datetime 
# -*- coding: cp1251 -*-
# Ввод аннглийскими буквами
class Note:
    def __init__(self, id, title, body, date):
        self.id = id
        self.title = title
        self.body = body
        self.date = date      
def save_notes(notes):
    file = "C://Users//ALEX8//OneDrive//Desktop//program//python//python10//notes.txt"
    with open(file, 'w', encoding="cp1251") as file:

        json.dump([note.__dict__ for note in notes], file, indent=4, separators=(',', ': '))

def read_notes():
    file = "C://Users//ALEX8//OneDrive//Desktop//program//python//python10//notes.txt"
    try:
        with open(file, 'r', encoding="cp1251") as file:

            data = json.load(file)
            notes = [Note(**note) for note in data]
    except (json.decoder.JSONDecodeError, FileNotFoundError):
        notes = []
    return notes

def add_note():
    title = input('Введите заголовок заметки: ')
    body = input('Введите текст заметки: ')
    date = datetime.now().strftime('%d.%m.%Y %H:%M:%S')
    id = str(uuid.uuid4())
    note = Note(id, title, body, date)
    notes.append(note)
    save_notes(notes)

def edit_note():
    id = input('Введите идентификатор заметки для редактирования: ')
    note = next((note for note in notes if note.id == id), None)
    if note:
        print(f'Редактирование заметки: {note.title}')
        title = input('Введите новый заголовок заметки (оставьте пустым, чтобы не менять): ')
        body = input('Введите новый текст заметки (оставьте пустым, чтобы не менять): ')
        date = input('Введите новую дату и время заметки в формате dd.mm.yyyy hh:mm:ss (оставьте пустым, чтобы не менять): ')
        if title:
            note.title = title
        if body:
            note.body = body
        if date:
            note.date = date
        save_notes(notes)
    else:
        print('Заметка не найдена')
        print(' ')

def delete_note():
    id = input('Введите идентификатор заметки для удаления: ')
    note = next((note for note in notes if note.id == id), None)
    if note:
        notes.remove(note)
        save_notes(notes)
    else:
        print('Заметка не найдена')
        print(' ')

def delete_all_note():
    notes.clear()
    save_notes(notes)
    print('Все заметки удалены')
    print(' ')

def view_notes_date():
    date_str = input('Введите дату для фильтрации заметок (в формате dd.mm.yyyy): ')
    try:
        filter_date = datetime.strptime(date_str, '%d.%m.%Y')
        filtered_notes = [note for note in notes if datetime.strptime(note.date, '%d.%m.%Y %H:%M:%S').date() == filter_date.date()]
    except ValueError:
        filtered_notes = notes
    if filtered_notes:
        for note in filtered_notes:
            print(f'{note.id} {note.title} ({note.body}) {note.date}')
    else:
        print('Нет заметок для отображения')
        print(' ')
def view_notes():
        if notes:
            for note in notes:
                print(f'{note.id} {note.title} ({note.body}) {note.date}')
        else:
            print('Нет заметок для отображения')
            print(' ')
    
def main():
    global notes
    notes = read_notes()
    while True:
        print(sys.getdefaultencoding())
        print(' ')
        print("Выберите одно из действий:")
        print("1 - Показать весь список заметок")
        print("2 - Показать список заметок(фильтр даты)")
        print("3 - Добавить заметку")
        print("4 - Редактировать заметку")
        print("5 - Удалить заметоку")
        print("6 - Удалить все заметки")
        print("7 - Выход")
        choice = input('Выберите действие: ')
        if choice == '1':
            view_notes()            
        elif choice == '2':
            view_notes_date()
        elif choice == '3':
            add_note()
        elif choice == '4':
            edit_note()
        elif choice == '5':
            delete_note()
        elif choice == '6':
            delete_all_note()
        elif choice == '7':
            break
        else:
            print('Недопустимый выбор')
            print(' ')
if __name__ == "__main__":
    main()





